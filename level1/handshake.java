import java.util.Scanner;
// filepath: c:\Users\ks759\BridgeLabz-Training-2Y\handshake.java
public class handshake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}