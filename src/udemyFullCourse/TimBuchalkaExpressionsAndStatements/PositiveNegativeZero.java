package udemyFullCourse.TimBuchalkaExpressionsAndStatements;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number for Verification");
        int number = scanner.nextInt();
        CheckNumber(number);
    }
    public static void CheckNumber(int number){

        if (number > 0){
            System.out.println("positive");
        }
        else if (number < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}
