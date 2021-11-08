package com.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalcServlet", urlPatterns = "/calc")
public class CalcServlet extends HttpServlet {
    public static Logger logger = LoggerFactory.getLogger(CalcServlet.class);

    // GET http://localhost:8080/shop/calc?a=10&b=20&c=div
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String operation = req.getParameter("c");
        int firstNumber = Integer.parseInt(req.getParameter("a"));
        int secondNumber = Integer.parseInt(req.getParameter("b"));
        int result = firstNumber + secondNumber;

        switch (operation) {
            case "sum":
                result = firstNumber + secondNumber;
                out.println("<html><body><h1>" + String.format("%d + %d = %d", firstNumber,secondNumber,result) +
                        "</html></body></h1>");
                out.close();
                break;
            case "div":
                result = firstNumber / secondNumber;
                out.println("<html><body><h1>" + String.format("%d / %d = %d", firstNumber,secondNumber,result) +
                        "</html></body></h1>");
                out.close();
                break;
            case "dif":
                result = firstNumber - secondNumber;
                out.println("<html><body><h1>" + String.format("%d - %d = %d", firstNumber,secondNumber,result) +
                        "</html></body></h1>");
                out.close();
                break;
            case "mul":
                result = firstNumber * secondNumber;
                out.println("<html><body><h1>" + String.format("%d * %d = %d", firstNumber,secondNumber,result) +
                        "</html></body></h1>");
                out.close();
                break;
            default:
                out.println("<html><body><h1>" + "Incorrect data" + "</html></body></h1>");
                out.close();
                break;
        }

    }
}
