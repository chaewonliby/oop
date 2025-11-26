import java.util.ArrayList;

public class Numbers {

        private ArrayList<Integer> num = new ArrayList<Integer>();
        private int min;
        private int max;

        public Numbers(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public void setNum() {
            for (int i = 0; i < 101; i++) {
                if (i % 4 == 0 && i % 5 != 0) {
                    num.add(i);
                }
            }
        }

        public int sumNum(){
            int sum = 0;
            for (int i : num){
                sum += i;
            }
            return sum;
        }

}
