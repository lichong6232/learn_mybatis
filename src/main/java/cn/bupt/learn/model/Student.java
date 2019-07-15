package cn.bupt.learn.model;

import java.io.Serializable;

/**
 * @Author: lichong04
 * @Date: Created in 下午5:38 2019/7/12
 */
public class Student implements Serializable {

    private Integer id;
    private String name;

    private Integer age;

    private Integer classNumber;

    private String gender;

    private Integer studentNumber;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classNumber=" + classNumber +
                ", gender='" + gender + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
