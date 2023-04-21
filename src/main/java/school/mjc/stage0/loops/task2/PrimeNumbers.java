package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int a = 2;
        while (printToInclusive >= a) {
            if (isPrime(a))
                System.out.println(a);
            a++;
        }
    }
    public boolean isPrime(int number) {
        if (number == 2)
            return true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
