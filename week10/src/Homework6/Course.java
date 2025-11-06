package Homework6;

public class Course{
    private String code;
    private String name;

    public Course(String c, String n) {
        this.code = c;
        this.name = n;
    }

    public String getCode() {
        return code;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return code + " " + name;
    }

}
