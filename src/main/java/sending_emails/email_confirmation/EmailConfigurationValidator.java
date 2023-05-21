package sending_emails.email_confirmation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailConfigurationValidator {

    private static final String EMAIL_REGEX = "^(.+)@(.+)$";
    private static final String SERVER_REGEX = "^smtp\\.(.+)\\.com$";

    public static void main(String[] args) {
        EmailConfig emailConfig = getEmailConfiguration();
        if (emailConfig != null) {
            System.out.println("Email configuration is valid:");
            System.out.println("From Email: " + emailConfig.getFromEmail());
            System.out.println("Password: " + emailConfig.getPassword());
            System.out.println("Server Host: " + emailConfig.getServerHost());
            System.out.println("Server Port: " + emailConfig.getServerPort());
        } else {
            System.out.println("Invalid email configuration.");
        }
    }

    private static EmailConfig getEmailConfiguration() {
        Scanner scanner = new Scanner(System.in);

        String fromEmail;
        do {
            System.out.print("Enter From Email: ");
            fromEmail = scanner.nextLine();
        } while (!validateEmail(fromEmail));

        String password;
        do {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
        } while (password.isEmpty());

        String serverHost;
        do {
            System.out.print("Enter Server Host: ");
            serverHost = scanner.nextLine();
        } while (!validateServerHost(serverHost));

        String serverPort;
        do {
            System.out.print("Enter Server Port: ");
            serverPort = scanner.nextLine();
        } while (!validateServerPort(serverPort));

        return new EmailConfig(fromEmail, password, serverHost, serverPort);
    }

    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean validateServerHost(String serverHost) {
        Pattern pattern = Pattern.compile(SERVER_REGEX);
        Matcher matcher = pattern.matcher(serverHost);
        return matcher.matches();
    }

    private static boolean validateServerPort(String serverPort) {
        try {
            int port = Integer.parseInt(serverPort);
            return port > 0 && port <= 65535;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static class EmailConfig {
        private String fromEmail;
        private String password;
        private String serverHost;
        private String serverPort;

        public EmailConfig(String fromEmail, String password, String serverHost, String serverPort) {
            this.fromEmail = fromEmail;
            this.password = password;
            this.serverHost = serverHost;
            this.serverPort = serverPort;
        }

        public String getFromEmail() {
            return fromEmail;
        }

        public String getPassword() {
            return password;
        }

        public String getServerHost() {
            return serverHost;
        }

        public String getServerPort() {
            return serverPort;
        }
    }
}
