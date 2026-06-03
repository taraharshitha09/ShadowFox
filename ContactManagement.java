import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> phones = new ArrayList<>();

        int choice;

        do {
            System.out.println("\nCONTACT MENU");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    names.add(name);
                    phones.add(phone);

                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nContacts List:");

                    for (int i = 0; i < names.size(); i++) {
                        System.out.println("Name: " + names.get(i));
                        System.out.println("Phone: " + phones.get(i));
                        System.out.println("         ");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}