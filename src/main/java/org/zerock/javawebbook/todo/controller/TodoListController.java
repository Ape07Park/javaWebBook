package org.zerock.javawebbook.todo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zerock.javawebbook.todo.dto.TodoDTO;
import org.zerock.javawebbook.todo.service.TodoService;

import java.io.IOException;
import java.util.List;

@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("/todo/list");

        List<TodoDTO> todoList = TodoService.INSTANCE.getTodoList(); // TodoService의 인스턴스를 생성하고 그것이 지닌 메소드 사용

        // request에 {"todoList":todoList} key, value 형식으로 저장
        request.setAttribute("todoList", todoList);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/todo/todoList.jsp");
        rd.forward(request,response);

    }


}