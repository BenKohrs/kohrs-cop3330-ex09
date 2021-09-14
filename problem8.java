import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double y = 350.0;
        System.out.print("What is the length of the ceiling? ");
        int length = x.nextInt();
        System.out.print("What is the width of the ceiling? ");
        int width = x.nextInt();
        int area = length * width;
        int numGallons = (int) (Math.ceil(area / y));
        System.out.printf("You will need to purchase " + numGallons
                + " gallons of paint to cover " + area + " square feet.\n");
    }
}
