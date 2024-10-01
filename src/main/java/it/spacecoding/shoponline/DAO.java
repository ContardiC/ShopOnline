package it.spacecoding.shoponline;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public Connection getConnection() throws SQLException {
        if(connection == null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("shop");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            dataSource.setPort(8889);
            connection = dataSource.getConnection();
            System.out.println(connection.toString());
        }
        return connection;
    }
    public ResultSet getProducts() throws SQLException {
        String sql = "select * from products";
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

}
