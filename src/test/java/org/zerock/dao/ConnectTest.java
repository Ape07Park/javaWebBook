package org.zerock.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTest {

    @Test // 테스트 코드 or 테스트 메소드라 부름 반드시 public으로 선언하며 파라미터나 리턴타입 x
    public void test1() {
        int v1 = 10;
        int v2 = 10;

        Assertions.assertEquals(v1, v2);
    }

    @Test
    public void testConnection() throws  Exception {
        Class.forName("com.mysql.jdbc.Driver"); // JDBC 드라이버 로딩. DB마다 클래스 이름 다름

        // 특정한 DB에 연결
        Connection conn = DriverManager.getConnection( // DB와의 네트워크 연결을 conn에 저장
                "jdbc:mysql://localhost:3306/webdb", // DB의 url을 의미. mysql jdbc 프로토콜을 이용/포트번호(네트워크 연결번호)/연결할 db 이름
                "webuser", // 사용자 id
                "webuser"); // 사용자 password

        Assertions.assertNotNull(conn);

        conn.close(); // DB와 연결 끊기

    }
}
