class Student{
    String name;
    double grade;
    int incomeBracket;

    Student(String name, double grade, int incomeBracket){
        this.name = name;
        this.grade = grade;
        this.incomeBracket = incomeBracket;
    }

    String getName(){
        return name;
    }
    double getGrade(){
        return grade;
    }
    int getIncomeBracket(){
        return incomeBracket;
    }

}
class TestStudent {

    public static void main(String[] args) {

        Student a = new Student("김규상", 4.1, 3);
        Student b = new Student("김민재", 3.71, 5);
        Student c = new Student("김규상", 3.93, 7);

        if (a.getGrade() >= 3.5 && a.getIncomeBracket() <= 5) {
            System.out.println("%a학생은 장학생 후보입니다", a.getName());
        }
        if (b.getGrade() >= 3.5 && b.getIncomeBracket() <= 5) {
            System.out.println("%b학생은 장학생 후보입니다", b.getName());
        }
        if (c.getGrade() >= 3.5 && c.getIncomeBracket() <= 5) {
            System.out.println("%c학생은 장학생 후보입니다", c.getName());
        }
    }
}

