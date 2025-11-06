public class Parent {
    private String name;
    public Parent(String n) {
        System.out.println("Parent 코드");
        name = n;
    }

    public Parent(){
        System.out.println("Default Parent 코드");
        name = null;
    } // child  super 안쓰려면 부모 생성자 이렇게 만들어야함
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}


