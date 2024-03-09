import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private LocalDate dateOfBirth;

    public Student(String name, String dateOfBirth) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayStudentAge() {
        LocalDate currentDate = LocalDate.now();
        long age = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("Nikita", "2003-03-22");
        student.displayStudentName();
        student.displayStudentAge();
    }
}