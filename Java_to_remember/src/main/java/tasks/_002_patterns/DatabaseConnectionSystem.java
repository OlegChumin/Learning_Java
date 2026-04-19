package tasks._002_patterns;

/**
 * Задача 2: Управление подключениями к базе данных
 * Описание:
 * Разработайте систему управления подключениями к различным базам данных (например, MySQL, PostgreSQL, Oracle). Система должна позволять легко переключаться между базами данных и управлять конфигурацией подключений.
 *
 * Требования:
 * Создайте интерфейс для подключения к базе данных.
 * Реализуйте несколько классов для различных типов баз данных.
 * Система должна поддерживать возможность изменения конфигурации подключения без изменения кода.
 * Добавьте возможность кэширования подключений для оптимизации производительности.
 *
 *Примененные паттерны:
 * Задача 2: Abstract Factory и Singleton.
 */

// Database Connection interface
interface DatabaseConnection {
    void connect();
}

// Concrete database connection classes
class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}

class OracleConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}

// Abstract Factory for database connections
interface DatabaseConnectionFactory {
    DatabaseConnection createConnection();
}

class MySQLConnectionFactory implements DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }
}

class PostgreSQLConnectionFactory implements DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection();
    }
}

class OracleConnectionFactory implements DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new OracleConnection();
    }
}

// Singleton for connection configuration
class ConnectionConfig {
    private static ConnectionConfig instance;
    private String config;

    private ConnectionConfig() {
        // Load configuration from file or environment
        this.config = "defaultConfig";
    }

    public static ConnectionConfig getInstance() {
        if (instance == null) {
            instance = new ConnectionConfig();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}

// Main class to demonstrate the solution
public class DatabaseConnectionSystem {
    public static void main(String[] args) {
        ConnectionConfig config = ConnectionConfig.getInstance();
        System.out.println("Current config: " + config.getConfig());
        config.setConfig("newConfig");
        System.out.println("Updated config: " + config.getConfig());

        DatabaseConnectionFactory mySQLFactory = new MySQLConnectionFactory();
        DatabaseConnectionFactory postgreSQLFactory = new PostgreSQLConnectionFactory();
        DatabaseConnectionFactory oracleFactory = new OracleConnectionFactory();

        DatabaseConnection mySQLConnection = mySQLFactory.createConnection();
        DatabaseConnection postgreSQLConnection = postgreSQLFactory.createConnection();
        DatabaseConnection oracleConnection = oracleFactory.createConnection();

        mySQLConnection.connect();
        postgreSQLConnection.connect();
        oracleConnection.connect();
    }
}
