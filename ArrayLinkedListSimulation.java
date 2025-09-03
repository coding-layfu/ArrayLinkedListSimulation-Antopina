/*  
    Name: Marilou Antopina
    Section: BSIT - 2A
    Date: September 3, 2025
*/

import java.util.Scanner;

public class ArrayLinkedListSimulation {
    private int[] data;
    private int size;

    public ArrayLinkedListSimulation() {
        data = new int[1];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = value;
        size++;
    }

    public int poll() {
        if (size == 0) {
            return -1;
        }
        int first = data[0];
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return first;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }
        return data[0];
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int last = data[size - 1];
        size--;
        return last;
    }

    public void display() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Current Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayLinkedListSimulation list = new ArrayLinkedListSimulation();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Array Linked List Simulation ---");
            System.out.println("1. Add element");
            System.out.println("2. Poll element (remove first)");
            System.out.println("3. Peek first element");
            System.out.println("4. Pop element (remove last)");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int value = scanner.nextInt();
                    list.add(value);
                    list.display();
                    break;
                case 2:
                    int polled = list.poll();
                    if (polled == -1) {
                        System.out.println("List is empty, nothing to poll.");
                    } else {
                        System.out.println("Polled: " + polled);
                    }
                    list.display();
                    break;
                case 3:
                    int peeked = list.peek();
                    if (peeked == -1) {
                        System.out.println("List is empty, nothing to peek.");
                    } else {
                        System.out.println("Peek: " + peeked);
                    }
                    list.display();
                    break;
                case 4:
                    int popped = list.pop();
                    if (popped == -1) {
                        System.out.println("List is empty, nothing to pop.");
                    } else {
                        System.out.println("Popped: " + popped);
                    }
                    list.display();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

/* --- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 1
Enter value to add: 23
Current Elements: 23 

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 1
Enter value to add: 12
Current Elements: 23 12 

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 23
Invalid choice. Try again.

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 2 
Polled: 23
Current Elements: 12

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 3
Peek: 12
Current Elements: 12

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 4
Popped: 12
List is empty.

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 5
List is empty.

--- Array Linked List Simulation ---
1. Add element
2. Poll element (remove first)
3. Peek first element
4. Pop element (remove last)
5. Display all elements
6. Exit
Enter choice: 6
Exiting program...
PS C:\Users\Lenovo\Documents\212 - Data Structures and Algorithm\For Prelim Practical>  */