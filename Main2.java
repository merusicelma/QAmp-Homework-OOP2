import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

        HashMap<Integer, String> studentInfo = new HashMap<>();
        studentInfo.put(1, "Adnan");
        studentInfo.put(2, "Edin");
        studentInfo.put(3, "Elvin");
        studentInfo.put(4, "Anes");

        Student myStudent = new Student(studentInfo);

        System.out.println("The student list is: ");
        myStudent.allStudents();
        System.out.println("Ordinal numbers of students are: ");
        myStudent.studentNumbers();
        System.out.println("The names of the students are: ");
        myStudent.studentNames();

        myStudent.addNewStudents();
        myStudent.changeStudent();
        myStudent.removeStudent();


    }
}
