package cn.sql.demo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Taeyeon-Serenity on 2017/3/13.
 */
public class Demo1 {
    @Test
    public void fun1() throws ClassNotFoundException, SQLException {
        /*jdbc四大配置参数：
        *   >driverClassName:com.mysql.jdbc.Driver
        *   >url:jdbc:mysql://localhost:3306/数据库名
        *   >username:
        *   >password:*/
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/spdb1";
        String username="root";
        String password="taeyeon";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println(con);
    }
}
