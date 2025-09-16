package Level1;
/*
5. Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
I/P => age
O/P => If the person's age is greater or equal to 18 then the output is
The person's age is ___ and can vote.
Otherwise
The person's age is ___ and cannot vote.
*/
import java.util.Scanner;
public class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        sc.close();
    }
}
