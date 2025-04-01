package week5;

import java.util.Scanner;

public class QueueProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(5); // Ukuran queue maksimal 5 elemen

        while (true) {
            System.out.println("\nQueue Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.print("Your Choice? ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    System.out.println(queue.isEmpty() ? "Queue is empty!" : "Queue is not empty.");
                    break;
                case 5:
                    System.out.println(queue.isFull() ? "Queue is full!" : "Queue is not full.");
                    break;
                case 6:
                    queue.getSize();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }

            System.out.print("\nDo you want to continue (Type y or n)? ");
            char cont = scanner.next().charAt(0);
            if (cont == 'n' || cont == 'N') {
                break;
            }
        }
        scanner.close();
    }
}
