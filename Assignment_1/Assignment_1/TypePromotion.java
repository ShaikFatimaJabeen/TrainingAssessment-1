import java.util.Scanner;
class TypePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scan.next().charAt(0);
        System.out.print("Enter an integer: ");
        int i = scan.nextInt();
        System.out.print("Enter a float: ");
        float f = scan.nextFloat();
        System.out.print("Enter a double: ");
        double d = scan.nextDouble();
        double result = c + i + f + d;
        System.out.println("Result: " + result);
        scan.close();
    }
}