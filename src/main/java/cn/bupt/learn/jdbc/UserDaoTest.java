package cn.bupt.learn.jdbc;

import cn.bupt.learn.jdbc.dao.impl.UserDaoImpl;

/**
 * @Author: lichong04
 * @Date: Created in 下午5:47 2019/7/12
 */
public class UserDaoTest {

    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        boolean success = userDaoImpl.deleteUserById(3);
        System.out.println(success);
    }
}
