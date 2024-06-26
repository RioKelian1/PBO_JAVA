import java.util.Scanner;

public class pbo_modul_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nLibrary System\n");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    loginAsStudent();
                    break;
                case 2:
                    loginAsAdmin();
                    break;
                case 3:
                    System.out.println("pengen turu!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 3);

        scanner.close();
    }

    private static void loginAsStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() == 15) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }
    }

    private static void loginAsAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username (admin): ");
        String username = scanner.nextLine();
        System.out.print("Enter your password (admin): ");
        String password = scanner.nextLine();

        // Dummy validation: Check if username and password are both "admin"
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }
}
