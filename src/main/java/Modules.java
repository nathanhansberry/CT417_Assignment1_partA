/*
Name: Nathan Hansberry
Date: 05/11/2021

Title: Assignment 1 for CT417 part A: Student Registration System

Description: Module class for  creating modules for students and courses
 */
import java.util.ArrayList;
import java.util.List;

public class Modules {

    //Declaring variables
    private final String name;
    private final String ID;
    private List<CourseProgramme> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    //Constructor for Method instances
    public Modules(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    // Getter method for getting module name
    public String getName() {
        return name;
    }

    //Getter method for getting module ID
    public String getID() {
        return ID;
    }

    // Getter method for getting modules students
    public List<Student> getStudents() {
        return students;
    }

    // Getter Method for getting list of courses
    public List<CourseProgramme> getCourses() {
        return courses;
    }

    //Method for adding Students to Modules
    public void addStudent(Student s) {
        students.add(s);
    }

    // ToString to print module name by default
    @Override
    public String toString(){
        return name;
    }
}