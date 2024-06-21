package org.zerock.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.javawebbook.todo2.dto.TodoDTO2;
import org.zerock.javawebbook.todo2.service.TodoService2;

import java.time.LocalDate;

public class TodoServiceTest {

    private TodoService2 todoService2;

    @BeforeEach
    public void ready() {
        todoService2 = TodoService2.INSTANCE;
    }

    @Test
    public void register() throws Exception {
        TodoDTO2 todoDTO2 = new TodoDTO2();

        TodoDTO2 todoDTO2Test = todoDTO2.builder().title("mapper test").dueDate(LocalDate.now()).finished(false).build();

        System.out.println(todoDTO2Test);

        todoService2.registerTodo(todoDTO2Test);

    }

}
