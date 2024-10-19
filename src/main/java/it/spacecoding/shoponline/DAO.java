package it.spacecoding.shoponline;

import com.mysql.cj.jdbc.MysqlDataSource;
import it.spacecoding.shoponline.beans.UserBean;

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
    public int addNewUser(UserBean user){
        int result = 0;
        String sql = "INSERT INTO users(first_name, last_name,email, password) VALUES('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getEmail()+"','"+user.getPassword()+"')";
        try{
            preparedStatement = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.executeUpdate();

            resultSet = preparedStatement.getGeneratedKeys();

            resultSet.next();

            return resultSet.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
