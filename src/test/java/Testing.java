/*
Name: Nathan Hansberry
Date: 05/11/2021

Title: Assignment 1 for CT417 part A: Student Registration System

Description: Testing Class for using Junit tests on the 3 classes created in the main folder
 */
import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testing {

    //Test 1 creates a student object and verifies name, username, age and DOB are all returned as expected
    @Test
    public void test1(){
        System.out.print("This test should pass");
        Student student = new Student("Ally Smith", new DateTime(2001, 5, 20, 0, 0), 17111111);
        assertEquals(student.getName(), "Ally Smith");
        assertEquals(student.getUsername(), "AllySmith20");
        assertEquals(student.getAge(), 20);
        assertEquals(student.getDOB(),  new DateTime(2001, 5, 20, 0, 0) );

    }

    //Test 2 creates a student object and deliberately fails to ensure the assertEquals fails the build when there is a mistake
    @Test
    public void test2(){
        System.out.print("This test should fail");
        Student student = new Student("Ally Smith", new DateTime(2001, 5, 20, 0, 0), 17111111);
        assertEquals(student.getName(), "Ally Smith");
        assertEquals(student.getUsername(), "Ally");
    }

    //Test 3 creates a module and a course instance and adds the module to the course. The courses list of modules (just 1 module is added) is compared to the expected outcome
    @Test
    public void test3(){
        System.out.print("This test should pass");
        Modules m = new Modules("Programming III", "CT-451");
        CourseProgramme c1 = new CourseProgramme("ECE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 6, 1, 0, 0));
        c1.addModule(m);
        assertEquals((c1.getModules().get(0).getName()), "Programming III");
    }

}


