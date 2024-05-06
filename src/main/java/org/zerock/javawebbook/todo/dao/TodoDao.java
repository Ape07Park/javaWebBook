package org.zerock.javawebbook.todo.dao;

import lombok.Cleanup;
import org.zerock.javawebbook.todo.dto.TodoVo;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDao {

    // try-catch 사용
    public String getTime(){
        String now ="";

        try(Connection conn = ConnectionUtil.INSTANCE.getConnection();

            PreparedStatement preparedStatement = conn.prepareStatement("select now()");
            ResultSet rs = preparedStatement.executeQuery();
        ){
            rs.next();
            now = rs.getString(1);

        }catch (Exception e){
            e.printStackTrace();
        }
        return now;
    }

    // @Cleanup 사용
    // @Cleanup을 쓰면 try-catch x 대신 throws Exception 추가
    public String getTime2() throws Exception {
        // @Cleanup: 이 어노테이션이 있으면 close() 자동으로 해줌
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = conn.prepareStatement("select now()");
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        return rs.getString(1); //  ResultSet에서 첫 번째 열(column)의 값을 가져와서 반환
    }

    public void insertTodo(TodoVo todo) throws Exception {
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