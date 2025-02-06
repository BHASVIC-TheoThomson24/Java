public class Main {

    public Main() {
        Bank bank = new Bank();
        boolean loggedIn = false;
        boolean quitting = false;
        int accountNo = -1;

        while (!loggedIn && !quitting) {
            System.out.println("Do you have an account? (y/n/quit)");
            String response = Console.readLine();
            System.out.println();
            if (response.equals("y")) {
                accountNo = bank.login();
                if (accountNo != -1)
                    loggedIn = true;
            }
            else if (response.equals("n"))
                bank.addAccount();
            else if (response.equals("quit"))
                quitting = true;
        }
/*
        while (!quitting) {
            System.out.println(
                    "Press 1 to check your balance\nPress 2 to deposit money\nPress 3 to withdraw money\nPress 4 to exit:\n");
            String option = Console.readLine();
            System.out.println();
            if (option.equals("1"))
                bank.checkBalance(accountNo);
            else if (option.equals("2")) {
                bank.deposit(accountNo);
                bank.checkBalance(accountNo);
            }
            else if (option.equals("3")) {
                bank.withdraw(accountNo);
                bank.checkBalance(accountNo);
            }
            else if (option.equals("4"))
                quitting = true;
            else
                System.out.println("Invalid option selected");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main();

 */
    }
}
