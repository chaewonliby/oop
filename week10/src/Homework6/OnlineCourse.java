package Homework6;

public class OnlineCourse extends Course{

    public OnlineCourse(String c, String n) {
        super(c, n);
    }

    public String toString(){
        String result= "OfflineCourse:"+super.getCode()+"Name:"+ super.getName()+",Type: Offline“";
        return result;
    }

}
