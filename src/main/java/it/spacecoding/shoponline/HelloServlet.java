package it.spacecoding.shoponline;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private ResultSet products;
    private DAO dao;
    private Connection con;
    public void init() {
        message = "Hello World!";
        dao = new DAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            dao.getConnection();
            products = dao.getProducts();
            while (products.next()) {
                out.println("<h1>" + products.getString("name") + "</h1>");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Hello


    }

    public void destroy() {
    }
}