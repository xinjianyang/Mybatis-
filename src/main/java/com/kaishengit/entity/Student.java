package com.kaishengit.entity;

/**
 *
 * @author User
 * @date 2017/10/23
 */
public class Student {

    private int id;
    private String stuName;

    private String stuAdress;

    public Student() {
    }

    public Student(String stuName, String stuAdress) {
        this.stuName = stuName;
        this.stuAdress = stuAdress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAdress() {
        return stuAdress;
    }

    public void setStuAdress(String stuAdress) {
        this.stuAdress = stuAdress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName=" + stuName +
                ", stuAdress=" + stuAdress +
                '}';
    }
}
