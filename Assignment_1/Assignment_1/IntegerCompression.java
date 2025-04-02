import java.util.Scanner;
class IntegerCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to encode: ");
        int n = sc.nextInt();
        int encoded = n ^ (n >> 1);
        System.out.println("Encoded value: " + encoded);
        sc.close();
    }
}