package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.zerock.javawebbook.todo.dao.TodoDao;
import org.zerock.javawebbook.todo.dto.TodoVo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoDaoTest {
    private TodoDao todoDao;

    @BeforeEach // @BeforeEach는 JUnit에서 사용되는 어노테이션으로 테스트 실행 전에 필요한 초기화 작업 수행
    public void ready() throws Exception {
        todoDao = new TodoDao();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDao.getTime());
    }

    @Test
    public void insertTest() throws Exception {
        TodoVo todoVo = TodoVo.builder()
                .title("test title").dueDate(LocalDate.of(2024,05,06))
                .finished(false)
                .build();

        todoDao.insertTodo(todoVo);
    }
    @Test
    public void getTodoListTest() throws Exception {
       List<TodoVo> todoList = new ArrayList<>();
       todoList = todoDao.getTodoList();
       todoList.forEach(x -> System.out.println(x));
    }
}
