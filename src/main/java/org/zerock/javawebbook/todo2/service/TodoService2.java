package org.zerock.javawebbook.todo2.service;

import org.modelmapper.ModelMapper;
import org.zerock.javawebbook.todo.dao.TodoDao;
import org.zerock.javawebbook.todo2.dao.TodoDao2;
import org.zerock.javawebbook.todo2.domain.TodoVo2;
import org.zerock.javawebbook.todo2.dto.TodoDTO2;
import org.zerock.javawebbook.todo2.util.ModelMapperUtil;

public enum TodoService2 {
    INSTANCE;

    private TodoDao2 dao;
    private ModelMapper mapper;

    TodoService2() {
        dao = new TodoDao2();
        mapper = ModelMapperUtil.INSTANCE.get();
    }

    public void registerTodo(TodoDTO2 todoDTO) throws Exception {
        System.out.println("asf" + todoDTO);

        TodoVo2 todoVo2 = mapper.map(todoDTO, TodoVo2.class);


        System.out.println(todoVo2);

        dao.insertTodo(todoVo2);
    }
}

