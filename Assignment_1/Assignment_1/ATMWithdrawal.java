import java.util.Scanner;
class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        int balance = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= balance && amount % 100 == 0) {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
        sc.close();
    }
}