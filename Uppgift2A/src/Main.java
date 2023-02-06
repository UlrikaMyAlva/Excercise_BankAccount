import java.util.Scanner;

public class Main {


    /*
    AUTHOR
    Ulrika Eriksson, 2022-05-13

    INTRODUCTION
    A bank account program, where you register your information and can make deposits or withdrawals to your account.

    IMPLEMENTATION
    The user enters their information in the beginning. The information is stored in the class Bankaccount, trough
    getters and setters. A menu, in a switch statement, is presented where the user can choose to make a deposit,
    withdrawal, see the entered information or exit the program. The deposit and withdrawals are sent to methods in the
    class, that adjusts the bank-account accordingly. The information is displayed through a formatted printed string
    and getters. When the user wants to exit they are asked to confirm their answer.

    DISCUSSION
    This was the second time I wrote this code, because my computer crashed. So I coded fast in fury. But I realised
    I had learned a lot and making this on, and 2C again was quite useful.

    The do-while statement was something I learned to implement trough talking to my classmates. In the exercises before
    I did a for-loop with one iteration, and an i-- to make it loop one time again before ending. This on the other hand
    is much cleaner and more logical of what the code actually does, which makes it easier for the reader to understand.

    In the getters and setters, I first wrote "this.Newname = name" but realised after I searched a bit that you do not
    have to use "New", you can just write this.name = name, which makes more sense why we use "this".

    I decided to make one method for withdrawal, and one for deposit. You could make this one method and ask the user to
    put in "-" before the number. If I would improve this code, I would make the withdrawal method catch if a user put in
    a minus sign before the number, and take it away before doing the calculation.


     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bankaccount information = new Bankaccount();

        System.out.println("Welcome to yourBank! Please enter your name: ");
        information.setName(scan.nextLine());
        System.out.println("Please enter your address: ");
        information.setAdress(scan.nextLine());
        System.out.println("Please enter your account number: ");
        information.setNumber(scan.nextDouble());
        System.out.println("Please enter your phone number: ");
        information.setPhone(scan.nextDouble());

        boolean exit = true;

        do {

            System.out.println("Please choose from the menu.");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. See information");
            System.out.println("4. Exit");

            int answer = scan.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("Please enter your deposit: ");
                    information.deposit(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Please enter your withdrawal: ");
                    information.withdrawal(scan.nextInt());
                    break;
                case 3:
                    System.out.printf("Name: %s%n Address: %s%n Account number: %f%n Phone number: %f%n Balance: %f%n"
                            , information.getName(), information.getAdress(), information.getNumber(),
                            information.getPhone(), information.getAccount());
                    break;
                case 4:
                    System.out.println("Are you sure you want to exit? 1.Yes 2.No");
                    int end = scan.nextInt();
                        if (end == 1) {
                            System.out.println("Thank you for using YourBank!");
                            exit = false; }
                        else {
                            break;
                    }

            }

        } while (exit);

    }
}