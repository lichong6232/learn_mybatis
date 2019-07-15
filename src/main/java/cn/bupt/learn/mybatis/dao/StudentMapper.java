package cn.bupt.learn.mybatis.dao;

import cn.bupt.learn.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午6:36 2019/7/12
 */
public interface StudentMapper {

    boolean deleteStudentById(@Param("id") Integer id);

    Student getStudentById(@Param("id") Integer id);

    List<Student> getStudents();

    boolean saveStudent(@Param("student") Student student);
}
