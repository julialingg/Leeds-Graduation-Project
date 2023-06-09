package com.example.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
    }

//    @Test
//    public void testDataSource() throws SQLException {
//        System.out.println(dataSource.getClass());
//
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//        connection.close();
//    }

    @Test
    public void testDataSource() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }


}
