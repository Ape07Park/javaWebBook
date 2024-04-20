package org.zerock.javawebbook.calc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calc/makeResult")
public class CalcController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


    }


}