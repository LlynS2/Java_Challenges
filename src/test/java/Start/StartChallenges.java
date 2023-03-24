package Start;

import Llyn.TargetSistemas.Challenges.*;
import java.util.Scanner;

public class StartChallenges {

    public static void main(String[] args) {

        Scanner optionMenu = new Scanner(System.in);
        Challenges challenges = new Challenges();
        int option;

        do {
            System.out.println("\n");
            System.out.println("Which of the challenges solutions would you like to see below ? ");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━✦✗✦━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ");
            System.out.println(" ");
            System.out.println("➭ Challenge 1 : Fibonacci' Sequence");
            System.out.println("➭ Challenge 2 : Monthly Payment");
            System.out.println("➭ Challenge 3 : Inverted String");
            System.out.println(" ");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ");
            System.out.println("Would you like to go out ? just type 0 \uD83D\uDE38");

            option = optionMenu.nextInt();

            switch (option) {
                case 1:
                    Scanner stringInsert = new Scanner(System.in);
                    challenges.FibonacciChallenge();
                    Fibonacci fibonacciSequenceChallenge = new Fibonacci();
                    fibonacciSequenceChallenge.questionSequence();
                    fibonacciSequenceChallenge.executeFibonacciSequence(Integer.parseInt(stringInsert.next()));
                    break;

                case 2:
                    challenges.MonthlyPaymentChallenge();
                    MonthlyPayment monthlyPaymentChallenge = new MonthlyPayment();
                    monthlyPaymentChallenge.showResultCalculation();
                    break;

                case 3:
                    challenges.InvertedStringChallenge();
                    InvertedString invertedStringChallenge = new InvertedString();
                    invertedStringChallenge.executeTheInversion();
                    break;

            } if(option >= 4){
                    System.out.print("Sorry...this option is not valid \uD83D\uDE30");
                }
        } while(option != 0);{
            System.out.print("See you later ! \uD83D\uDE3D");
        }
    }
}