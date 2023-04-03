package jdbc;

/**
 * Чтобы создать простой JDBC-коннектор к SQL-базе, вам потребуется выполнить следующие шаги:
 *
 * Убедитесь, что у вас установлен JDBC-драйвер для вашей базы данных (например, MySQL, PostgreSQL, Oracle и т.д.).
 * Импортируйте необходимые пакеты.
 * Зарегистрируйте драйвер JDBC.
 * Создайте соединение с базой данных.
 * Выполните SQL-запросы и обработайте результаты.
 * Вот пример простого JDBC-коннектора для базы данных MySQL:
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSimpleConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Загрузка и регистрация драйвера JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Создание соединения с базой данных
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            // Создание Statement для выполнения SQL-запроса
            statement = connection.createStatement();

            // Выполнение SQL-запроса и получение ResultSet
            resultSet = statement.executeQuery("SELECT * FROM your_table_name");

            // Обработка результатов запроса
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Закрытие ресурсов
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
