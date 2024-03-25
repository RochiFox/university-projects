/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.LinkedList;

/**
 *
 * @author Flace
 */
public class StudentList {
    private LinkedList<Student> students;
    
    public StudentList() {
        students = new LinkedList<>();
    }
    
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public void addStudentAtIndex(int index, Student student) {
        students.add(index, student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayStudentsWithHighGrades() {
        for (Student student : students) {
            if (student.getAverageGrade() > 4) {
                System.out.println(student);
            }
        }
    }

    public Student getFirstStudent() {
        return students.getFirst();
    }

    public Student removeFirstStudent() {
        return students.poll();
    }

    public Student getLastStudent() {
        return students.getLast();
    }

    public Student removeLastStudent() {
        return students.pollLast();
    }

    public Student getStudentByStudentID(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }
}
