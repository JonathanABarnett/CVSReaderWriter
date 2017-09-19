package main;

import entities.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Writer {

    private String COMMA_DELIMITER = ",";
    private String NEW_LINE_SEPARATER = "\n";
    private String FILE_HEADER = "ID, LAST_NAME, FIRST_NAME, AGE, GPA, GRADE_LEVEL, DATE_CREATED";
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String source = "src\\data\\studentList2.csv";
    private BufferedWriter fileWriter = new BufferedWriter(new FileWriter(source, true));

    public Writer() throws IOException {
    }

    public void writeFile(List<Student> studentList) throws Exception {
        //BufferedWriter fileWriter = null;
        try {
            //fileWriter = new BufferedWriter(new FileWriter(source));
            Reader reader = new Reader();

            if (reader.fileIsEmpty()) {
                fileWriter.write(FILE_HEADER);
                write(studentList);
            } else {
                write(studentList);
            }
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            fileWriter.close();
        }
    }


    public void write(List<Student> studentList) throws Exception {
        //fileWriter = new BufferedWriter(new FileWriter(source, true));
        for (Student student : studentList) {
            fileWriter.write(NEW_LINE_SEPARATER + String.valueOf(student.getId()) + COMMA_DELIMITER + student.getLastName() +
                    COMMA_DELIMITER + student.getFirstName() + COMMA_DELIMITER + String.valueOf(student.getAge()) + COMMA_DELIMITER +
                    String.valueOf(student.getGpa()) + COMMA_DELIMITER + student.getGradeLevel() + COMMA_DELIMITER +
                    sdf.format(student.getCreationDate()));
        }
    }
}
