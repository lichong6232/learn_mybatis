package cn.bupt.learn.jdbc.dao.impl;

import cn.bupt.learn.jdbc.JdbcUtil;
import cn.bupt.learn.jdbc.dao.UserDao;
import cn.bupt.learn.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: lichong04
 * @Date: Created in 下午5:36 2019/7/12
 */
public class UserDaoImpl implements UserDao {

    private static Connection connection = JdbcUtil.getConnection();
    @Override
    public User getUserById(Integer id){
        try {
            Statement statement = connection.createStatement();
            String querySql = "select * from user where id = "+id;
            ResultSet resultSet = statement.executeQuery(querySql);
            User user = new User();
            while (resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteUserById(Integer id){

        try {
            Statement statement = connection.createStatement();
            String removeSql = "delete from user where id = "+id;
            return statement.executeUpdate(removeSql)>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean saveUser(User user){
        try {
            Statement statement = connection.createStatement();
            String saveSql = "insert into user('username','password') values('"+user.getUserName()+"','"+user.getPassword()+"')";
            return statement.executeUpdate(saveSql)>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
