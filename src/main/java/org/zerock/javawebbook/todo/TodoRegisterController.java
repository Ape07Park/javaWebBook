package org.zerock.javawebbook.todo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
    private String message;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/todo/todoRegister.jsp");
        rd.forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 날짜와 할 일 받기
        String date = request.getParameter("date");
        String todo = request.getParameter("todo");

        // db에 저장할 수 있게 세팅 및 db 조작하는 service 쪽으로 날짜와 할일 보내기

       // todoList page로 이동
        response.sendRedirect("/todo/list");

        

    }


}