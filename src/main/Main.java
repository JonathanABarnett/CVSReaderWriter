package main;

import entities.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Doe", "John", 15, 3.4, "Sophomore", new Date()));
        studentList.add(new Student(2, "Smith", "Doug", 16, 2.3, "Junior", new Date()));
        studentList.add(new Student(3, "Hi", "Jane", 15, 3.8, "Sophomore", new Date()));
        studentList.add(new Student(4, "Doe", "Jane", 13, 3.9, "Freshman", new Date()));
        studentList.add(new Student(6, "Six", "See", 19, 3.9, "Senior", new Date()));

        Reader reader = new Reader();
        reader.readFile();

        Writer writer = new Writer();
        writer.writeFile(studentList);

    }

}
