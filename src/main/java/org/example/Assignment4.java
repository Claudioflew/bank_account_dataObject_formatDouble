package org.example;

public class Assignment4 {
    final static int NUM_OF_ARRAY = 5;
    final static double ANNUAL_INTEREST_RATE = 0.03;

    public static void main(String[] args) {
        Account.setAnnualInterestRate(ANNUAL_INTEREST_RATE);

        Account[] accountArray = new Account[NUM_OF_ARRAY];
        for (int i = 0; i < NUM_OF_ARRAY; i++) {
            accountArray[i] = new Account(1000 * (i + 1), 1000.0 * (i + 1));
            accountArray[i].withdraw(500);
            accountArray[i].deposit(1000);
        }
        displayAccounts(accountArray);
    }

    public static void displayAccounts(Account[] accountArray) {
        System.out.println();
        displayHeader();

        for (Account account : accountArray) {
            account.display();
            account.addMonthlyInterest();
        }
    }

    private static void displayHeader() {
        System.out.printf("%15s%20s%20s%15s%25s\n", "Account Number", "Initial Balance",
                "Monthly Interest", "Balance", "Date Created");
        System.out.println("=====================================================================================================");
    }
}