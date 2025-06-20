

package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author claudioalmeida
 */



public class ConnectionFactory {

    private static ConnectionFactory instance;  // instância única da fábrica
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/assetdb";
    private static final String USER = "root";
    private static final String PASSWORD = "senha";

    private ConnectionFactory() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados", e);
        }
    }

    public static ConnectionFactory getInstance() {
        if (instance == null) {
            synchronized (ConnectionFactory.class) {
                if (instance == null) {
                    instance = new ConnectionFactory();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}