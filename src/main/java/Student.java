/*
Name: Nathan Hansberry
Date: 05/11/2021

Title: Assignment 1 for CT417 part A: Student Registration System

Description: Student Class for my student registration system.
             Each instance contains all of the relative information for each student.
 */
import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // Declaring student variables
    private final String name;
    private final String username;
    private final DateTime DOB;
    private int age;
    private final int ID;
    private List<Modules> modules = new ArrayList<>();
    private List<CourseProgramme> courses = new ArrayList<>();

    //Constructor for student instances
    public Student(String name, DateTime DOB, int ID) {
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        setAge();
        String st = name + age;
        this.username= st.replaceAll("\\s+",""); // Removes white space

    }

    // Setter Method to set the students age based on the DOA entered
    private void setAge() {
        age = new Period(DOB, DateTime.now()).getYears();
    }

    // Getter Method for List of Modules
    public List<Modules> getModules() {
        return modules;
    }

    // Getter method for Courses
    public List<CourseProgramme> getCourses() {
        return courses;
    }

    // Getter method for the student name
    public String getName() {
        return name;
    }

    // Getter method for DOA
    public DateTime getDOB() {
        return DOB;
    }

    // Getter method for Age
    public int getAge() {
        return age;
    }

    // Getter method for username
    public String getUsername() {
        return username;
    }

    // Getter Method for student ID
    public int getID() {
        return ID;
    }

    // ToString method to print Student name by default
    @Override
    public String toString(){
        return name;
    }

}

