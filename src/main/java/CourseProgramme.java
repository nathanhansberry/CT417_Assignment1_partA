/*
Name: Nathan Hansberry
Date: 05/11/2021

Title: Assignment 1 for CT417 part A: Student Registration System

Description: Course Programme class which contains modules and students for Student Registration System
 */

import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;

public class CourseProgramme {
    // Declaring Variables
    private final String name;
    private final DateTime startDate;
    private final DateTime endDate;
    private List<Modules> modules = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    // Creating instances of courses using constructor
    public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getter method for module name
    public String getName() {
        return name;
    }

    // Getter method for course end date
    public DateTime getEndDate() {
        return endDate;
    }

    // Getter method for course start date
    public DateTime getStartDate() {
        return startDate;
    }

    // Getter method for course modules
    public List<Modules> getModules() {
        return modules;
    }

    // Getter method for course students
    public List<Student> getStudents() {
        return students;
    }

    // Method for adding modules to courses
    public void addModule(Modules m) {
        modules.add(m);
    }

    //ToString method for printing course name by default
    @Override
    public String toString(){
        return name;
    }
}