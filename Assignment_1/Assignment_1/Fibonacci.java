import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt(), a = 0, b = 1, count = 0;
        do {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            count++;
        } while (count < n);
        sc.close();
    }
}