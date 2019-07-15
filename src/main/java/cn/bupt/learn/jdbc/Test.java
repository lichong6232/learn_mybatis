package cn.bupt.learn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:28 2019/7/15
 */
public class Test {

    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();

        String sql = "select * from user where id =1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String id = resultSet.getString("id");
            String name = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("id="+id+",name="+name+",password"+password);
        }
    }
}
