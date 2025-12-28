// Importing required classes from Java Collections Framework
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Class name
public class declarations {
    public static void main(String[] args) {

        // ---------------- ArrayList Declaration and Usage ----------------

        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(23);

        // Printing the entire ArrayList
        System.out.println(list);

        // Accessing element at index 0
        System.out.println(list.get(0));

        // Removing element at index 0
        list.remove(0);

        // Printing ArrayList after removal
        System.out.println(list);

        // Traversing ArrayList using enhanced for loop
        for (int num : list) {
            System.out.println(num);
        }

        // Printing size of ArrayList
        System.out.println(list.size());

        // Checking if ArrayList contains a specific element
        System.out.println(list.contains(23));

        // ---------------- LinkedList Declaration and Usage ----------------

        // Creating a LinkedList of Integer type
        LinkedList<Integer> l1 = new LinkedList<>();

        // Adding elements to LinkedList
        l1.add(20);          // Adds element at the end
        l1.addFirst(30);     // Adds element at the beginning

        // Updating element at index 1
        l1.set(1, 44);

        // Printing LinkedList
        System.out.println(l1);

        // Removing last element from LinkedList
        l1.removeLast();

        // Printing LinkedList after removal
        System.out.println(l1);

        // ---------------- Stack Declaration and Usage ----------------

        // Creating a Stack of Integer type
        Stack<Integer> s1 = new Stack<>();

        // Pushing elements onto the stack
        s1.push(2);
        s1.push(3);
        s1.push(5);

        // Printing stack
        System.out.println(s1);

        // Removing top elements from stack
        s1.pop();
        s1.pop();

        // Printing stack after pop operations
        System.out.println(s1);

        // Viewing the top element without removing it
        s1.peek();

        // Removing the remaining element
        s1.pop();

        // Checking if stack is empty
        System.out.println(s1.isEmpty());

        // ---------------- Queue Declaration and Usage ----------------

        // Creating a Queue using LinkedList
        Queue<Integer> q1 = new LinkedList<>();

        // Adding element to queue
        q1.add(4);

        // Viewing front element of queue
        q1.peek();

        // Removing front element from queue
        q1.remove();

        // Checking if queue is empty
        System.out.println(q1.isEmpty());

        // Printing queue
        System.out.println(q1);
    }
}
