package it.spacecoding.shoponline.servlets;

import it.spacecoding.shoponline.DAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

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

    }
}
