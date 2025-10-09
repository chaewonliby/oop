class Test{
emun Month{
JAN(1), FEB(2), MAR(3), APR(4), MAY(5),
JUN(6), JUL(7), AUG(8), SEP(9), OCT(10),
NOV(11), DEC(12);

int month;

Month(int month) { this.month = month; }
int getMonth(){ return month; }
        }
                }
public class Testemun {
    public static void main(String[] args) {
        System.out.printf("Month.SEP = %d\n", Month.SEP.getMonth());
    }
}