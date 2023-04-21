package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive >0 ) {
            int a = 0 ;
            while ( multiplyByAndToInclusive >= a) {
                System.out.println(multiplyByAndToInclusive*a);
                a++ ;
            }
        }else{
            int a = 0 ;
            while ( multiplyByAndToInclusive <= a) {
                System.out.println(multiplyByAndToInclusive*a);
                a-- ;
            }
        }
    }
}
