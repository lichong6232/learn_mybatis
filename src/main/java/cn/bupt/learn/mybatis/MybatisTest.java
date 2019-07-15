package cn.bupt.learn.mybatis;

import cn.bupt.learn.model.Student;
import cn.bupt.learn.mybatis.dao.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午6:48 2019/7/12
 */
public class MybatisTest {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");

        //创建SqlSessionFactory
        SqlSessionFactory sqlFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession sqlSession = sqlFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        /*//删除学生
        boolean b = studentMapper.deleteStudentById(2);
        sqlSession.commit();
        System.out.println(b);*/

        /*//根据id查询学生
        Student student = studentMapper.getStudentById(1);
        System.out.println(student);*/

        /*//查询所有学生
        List<Student> students = studentMapper.getStudents();
        System.out.println(students);*/

        Student student = new Student();
        student.setAge(27);
        student.setGender("男");
        student.setName("李冲");
        student.setStudentNumber(111112);
        student.setClassNumber(2);
        boolean success = studentMapper.saveStudent(student);
        sqlSession.commit();
        System.out.println(success);

    }
}
