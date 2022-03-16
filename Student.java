import java.util.HashMap;
import java.util.Scanner;

public class Student {
    Scanner reader = new Scanner(System.in);
    public Integer number;
    public String name;
    public HashMap<Integer, String> studentInfo;

    public Student(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }

    public void addStudent(Integer number, String name) {
        this.number = number;
        this.name = name;
        studentInfo.put(this.number, this.name);
    }

    public void allStudents() {
        for (HashMap.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println(singleStudent.getKey() + ". " + singleStudent.getValue());
        }
    }

    public void studentNumbers() {
        for (HashMap.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println(singleStudent.getKey() + " ");
        }
    }

    public void studentNames() {
        for (HashMap.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println(singleStudent.getValue() + " ");
        }
    }

    public void addNewStudents() {
        System.out.println("Enter ordinal number and name for the new student: ");
        Integer number = reader.nextInt();
        this.number = number;
        String name = reader.nextLine();
        this.name = name;
        studentInfo.put(this.number, this.name);
        System.out.println(studentInfo);
    }

    public void changeStudent() {
        System.out.println("Enter ordinal number and name for the new student for replace: ");
        studentInfo.replace(reader.nextInt(), reader.next());
        System.out.println(studentInfo);
    }

    public void removeStudent() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter ordinal number of student name which you want to remove: ");
        studentInfo.remove(reader.nextInt());
        System.out.println(studentInfo);
    }

}

