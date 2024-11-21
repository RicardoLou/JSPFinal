package com.RicardoLou.util;

import java.sql.*;

/**
 * 第六题
 * tips1：第五题指的是按照本项目的src下的文件夹来对项目进行解耦合
 * tips2：本文件需要修改的地方有：url中 3306 后 ？ 前，修改为你的数据库名，user，password
 */
public class JDBCUtil {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/Ricardo?serverTimezone=UTC";
    private static String user = "root";
    private static String password = "123456";

    static {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
