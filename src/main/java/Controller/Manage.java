package Controller;

import Model.Student;
import View.Validation;
import java.util.ArrayList;

import java.util.Comparator;
        
import java.util.Collections;
import java.util.Scanner;


public class Manage {
    public ArrayList<Student> studentList = new ArrayList<>();
    public void createStudent(int iD, String nameStudent, String semester, String courseName ){
        Student student = new Student(iD, nameStudent, semester, courseName);
        studentList.add(student);
    }
    
    public void createStudentFromInput(Scanner scanner, Validation validation) {
        System.out.print("Enter student ID: ");
        int id = validation.checkInputIntLimit(1, Integer.MAX_VALUE);
        System.out.print("Enter student name: ");
        String studentName = validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = validation.checkInputString();
        System.out.print("Enter course name (Java/.Net/C/C++): ");
        String courseName = validation.checkInputCourse();
        createStudent(id, studentName, semester, courseName);
    }
    
     public void updateStudent(int id, String studentName, String semester, String courseName, Validation validation) {
        for (Student student : studentList) {
            if (student.getiD() == id) {
                student.setNameStudent(studentName);
                student.setSemester(semester);
                student.setCourseName(courseName);
                break;
            }
        }
        
    }
    public void updateStudentFromInput(Scanner scanner, Validation validation) {
        System.out.print("Enter student ID: ");
        int studentId = validation.checkInputIntLimit(1, Integer.MAX_VALUE);
        ArrayList<Student> students = getStudentList();
        boolean found = false;
        for (Student student : students) {
            if (student.getiD() == studentId) {
                found = true;
                System.out.print("Do you want to update (U) or delete (D) student (U/D)? ");
                boolean isUpdate = validation.checkInputUD();
                if (isUpdate) {
                    System.out.print("Enter new student name: ");
                    String newStudentName = validation.checkInputString();
                    System.out.print("Enter new semester: ");
                    String newSemester = validation.checkInputString();
                    System.out.print("Enter new course name (Java/.Net/C/C++): ");
                    String newCourseName = validation.checkInputCourse();
                    updateStudent(studentId, newStudentName, newSemester, newCourseName, validation);
                    System.out.println("Student updated successfully.");
                } else {
                    deleteStudent(studentId);
                    System.out.println("Student deleted successfully.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
    public void deleteStudent(int id) {
        studentList.removeIf(student -> student.getiD()== id);
    }

    public ArrayList<Student> searchStudents(String studentName) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getNameStudent().toLowerCase().contains(studentName.toLowerCase())) {
                result.add(student);
            }
        }
        Collections.sort(result, Comparator.comparing(Student::getNameStudent));

        return result;
    }
    
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}
