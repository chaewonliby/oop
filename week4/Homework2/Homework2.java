import java.util.Scanner;

class Student {
    private int studentId;     // 학번
    private String name;       // 이름
    private String major;      // 전공
    private long phone;        // 전화번호(숫자만, 선행 0 제거된 상태로 저장)

    public Student() {}

    public Student(int studentId, String name, String major, long phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }
}

public class Homework2 {

    // 010-xxxx-xxxx 형태로 복구 및 하이픈 삽입
    private static String formatPhone(long rawPhone) {
        String s = Long.toString(rawPhone); // 예: "1053559999"
        if (s.length() == 10) s = "0" + s;  // 앞자리 0 복구 → "01053559999"
        if (s.length() != 11) return s;     // 방어적 처리

        return s.substring(0, 3) + "-" + s.substring(3, 7) + "-" + s.substring(7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();          // 학번
            String name = sc.next();        // 이름
            String major = sc.next();       // 전공
            long phone = sc.nextLong();     // 전화번호(하이픈X, 선행 0 없이)

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        String[] order = {"첫번째", "두번째", "세번째"};
        for (int i = 0; i < 3; i++) {
            Student s = students[i];
            System.out.printf(
                    "%s 학생: %d %s %s %s%n",
                    order[i],
                    s.getStudentId(),
                    s.getName(),
                    s.getMajor(),
                    formatPhone(s.getPhone())
            );
        }
        sc.close();
    }
}
