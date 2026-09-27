import java.util.Scanner;

class Student {
    private long studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public Student(long studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            long studentId = scanner.nextLong();
            String name = scanner.next();
            String major = scanner.next();
            long phoneNumber = scanner.nextLong();

            students[i] = new Student(studentId, name, major, phoneNumber);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            Student student = students[i];

            String phone = Long.toString(student.getPhoneNumber());

            if (phone.length() == 10) {
                phone = "0" + phone;
            }

            phone = phone.substring(0, 3) + "-"
                    + phone.substring(3, 7) + "-"
                    + phone.substring(7);

            System.out.println(
                    (i + 1) + "번째 학생: "
                            + student.getStudentId() + " "
                            + student.getName() + " "
                            + student.getMajor() + " "
                            + phone
            );
        }

        scanner.close();
    }
}