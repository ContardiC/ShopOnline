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
    public Connection getConnection(){
        if(connection == null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("shop");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            dataSource.setPort(8889);
            try{
                connection = dataSource.getConnection();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
            System.out.println(connection.toString());
        }
        return connection;
    }
    /**
     * Retrieves all products from the database.
     *
     * @return a ResultSet containing all product data, or null if a database error occurs
     */
    public ResultSet getProducts() {
        String sql = "select * from products";
        resultSet = null;
        try{
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return resultSet;
    }
    public int insertProduct(){
        String sql = "insert into products values(?,?,?,?)";
        return 1;
    }

}
