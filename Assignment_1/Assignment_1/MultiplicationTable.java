import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(n + " x " + i + " = " + (n * i));
        int i = 1;
        while (i <= 10) { System.out.println(n + " x " + i + " = " + (n * i)); i++; }
        i = 1;
        do { System.out.println(n + " x " + i + " = " + (n * i)); i++; } while (i <= 10);
        sc.close();
    }
}