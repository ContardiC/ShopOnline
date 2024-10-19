package it.spacecoding.shoponline.servlets;

import it.spacecoding.shoponline.DAO;
import it.spacecoding.shoponline.beans.UserBean;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
@WebServlet(name = "usersServlet", value = "/users-servlet")

public class UsersServlet extends HttpServlet {
    private String message;
    private ResultSet products;
    private DAO dao;
    private Connection con;
    public void init() {
        message = "Hello World!";
        dao = new DAO();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserBean user = new UserBean(firstName, lastName, email, password);
        int userId = dao.addNewUser(user);
        if(userId > 0) {
            message = "User added successfully";
        }else{
            message = "User not added";
        }
        out.println(message);
    }
}
