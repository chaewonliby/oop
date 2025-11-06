package Homework6;

public class OfflineCourse extends Course{

    public OfflineCourse(String c, String n) {
        super(c, n);
    }

    public String toString(){
        String result= "OnlineCourse:"+super.getCode()+"Name:"+ super.getName()+",Type: Online";
        return result;
    }
}
