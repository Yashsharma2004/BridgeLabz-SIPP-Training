import java.util.ArrayList;
import java.util.Collections;

public class StudentService {
    public static void main(String[] args) {
        Student s1 = new Student("Amit Kumar", 101, 21);
        Student s2 = new Student("Priya Sharma", 102, 22);
        Student s3 = new Student("Rahul Singh", 103, 23);
        Student s4 = new Student("Sneha Patel", 104, 20);
        Student s5 = new Student("Vikas Verma", 105, 24);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        Collections.sort(studentList, (studentA, studentB) -> Integer.compare(studentA.getStudentId(), studentB.getStudentId()));

        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", StudentId " + student.getStudentId() + ", Age: " + student.getAge());
        }
    }
}
