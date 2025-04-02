import java.util.Scanner;
class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountRate = sc.nextDouble();
        double finalPrice = price - (price * discountRate / 100);
        System.out.println("Final price after discount: " + finalPrice);
        sc.close();
    }
}