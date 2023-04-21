package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a = 0;
        int fact = 1 ;
        while (a <= printToInclusive) {
            System.out.println(a*fact);
            a++;
        }
    }
}
