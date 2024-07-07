package org.zerock.javawebbook.todo2.service;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.zerock.javawebbook.todo2.dao.TodoDao2;
import org.zerock.javawebbook.todo2.domain.TodoVo2;
import org.zerock.javawebbook.todo2.dto.TodoDTO2;
import org.zerock.javawebbook.todo2.util.ModelMapperUtil;

@Log4j2
public enum todoServiceLog {
    INSTANCE;

    private TodoDao2 dao2;
    private ModelMapper modelMapper;

    /**
     * todo: 고치기
     */
    TodoServiceLog() {
        dao2 = new TodoDao2();
        modelMapper = ModelMapperUtil.INSTANCE.get();
    }
    public void registerTodo(TodoDTO2 todoDTO2) throws Exception {
        TodoVo2 todoVo2 = modelMapper.map(todoDTO2, TodoVo2.class);

        log.info(todoVo2);
        dao2.insertTodo(todoVo2);
    }
}
