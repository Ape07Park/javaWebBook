package org.zerock.javawebbook.todo2.dao;

import lombok.Cleanup;
import org.zerock.javawebbook.todo.dao.ConnectionUtil;
import org.zerock.javawebbook.todo.dto.TodoVo;
import org.zerock.javawebbook.todo2.domain.TodoVo2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class TodoDao2 {

    public void insertTodo(TodoVo2 todo) throws Exception {
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection(); // db와의 연결
        String sql = "insert into tbl_todo (title, dueDate, finished) values(?, ?, ?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql); // sql문 단 상태에서 db와의 연결
        // sql문의 파라미터 세팅
        pstmt.setString(1, todo.getTitle());
        pstmt.setDate(2, Date.valueOf(todo.getDueDate()));
        pstmt.setBoolean(3, todo.isFinished());

        pstmt.executeUpdate(); // sql문 전송 및 실행

    }
}
