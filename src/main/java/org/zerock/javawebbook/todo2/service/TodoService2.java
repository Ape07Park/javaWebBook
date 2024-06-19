package org.zerock.javawebbook.todo2.service;

import org.modelmapper.ModelMapper;
import org.zerock.javawebbook.todo.dao.TodoDao;
import org.zerock.javawebbook.todo2.TodoVo2;
import org.zerock.javawebbook.todo.dto.TodoDTO;
import org.zerock.javawebbook.todo2.util.ModelMapperUtil;

public enum TodoService2 {
    INSTANCE;

    private TodoDao dao;
    private ModelMapper mapper;

    TodoService2() {
        dao = new TodoDao();
        mapper = ModelMapperUtil.INSTANCE.get();
    }

    public void registerTodo(TodoDTO todoDTO) throws Exception {
        TodoVo2 todoVo2 = mapper.map(todoDTO, TodoVo2.class);

        System.out.println(todoDTO);
    }
}

