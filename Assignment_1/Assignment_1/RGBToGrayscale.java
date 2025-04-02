import java.util.Scanner;
class RGBToGrayscale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter RGB values (R G B): ");
        int r = scan.nextInt(), g = scan.nextInt(), b = scan.nextInt();
        int grayscale = (r * 30 + g * 59 + b * 11) / 100;
        System.out.println("Grayscale value: " + grayscale);
        scan.close();
    }
}