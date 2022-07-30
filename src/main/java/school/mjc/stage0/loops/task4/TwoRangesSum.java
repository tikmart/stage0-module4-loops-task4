package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int totalSum = 0;
        int skippedSum = 0;
        int countedSum = 0;
        if(lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
        for (int i = 1; i <= lastInRow ; i++) {

            totalSum +=i;
            if (i <= numberToSkip) {
                continue;
            }

            countedSum += i;



        }
            skippedSum = totalSum - countedSum;
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }


    }


    public static void main(String[] args) {
        printSumOfTwoRanges(5,10);
        printSumOfTwoRanges(15,10);
        printSumOfTwoRanges(10,10);
        printSumOfTwoRanges(-10,-1);
    }
}
