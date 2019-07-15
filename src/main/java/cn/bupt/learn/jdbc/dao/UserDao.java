package cn.bupt.learn.jdbc.dao;

import cn.bupt.learn.model.User;

/**
 * @Author: lichong04
 * @Date: Created in 下午12:06 2019/7/13
 */
public interface UserDao {

    User getUserById(Integer id);

    boolean deleteUserById(Integer id);

    boolean saveUser(User user);
}
