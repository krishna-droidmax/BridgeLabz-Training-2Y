import java.util.Scanner;

public class area_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in centimeters): ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height of the triangle (in centimeters): ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / 6.4516; // 1 square inch = 6.4516 square centimeters

        System.out.println("Area of the triangle is " + areaCm2 + " square centimeters and " + areaIn2 + " square inches.");

        input.close();
    }
}
