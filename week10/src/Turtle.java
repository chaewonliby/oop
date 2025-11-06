public class Turtle {
    protected int limbs = 4; // 방법 1. limbs protected 변수
    protected  String food;

    public void setFood(String f) {
        this.food = f;
    }

    public void eat(){
        System.out.println("Turtle Eats" + food );
    }


    //방법 2. public get 함수
    public void getlimbs(){
        System.out.println("Turtle Limbs" + limbs);
    }
}
