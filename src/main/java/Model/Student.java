/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class Student implements Comparable<Student>{
    public int iD;
    public String nameStudent;
    public String semester;
    public String courseName;

    public Student(int iD, String nameStudent, String semester, String courseName) {
        this.iD = iD;
        this.nameStudent = nameStudent;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" + "iD=" + iD + ", nameStudent=" + nameStudent + ", semester=" + semester + ", courseName=" + courseName + '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.nameStudent.compareTo(nameStudent);
    }
    
    
    
  
    
}
