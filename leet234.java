import java.util.Stack;

public class leet234 {
    public static void main(String[] args) {
        Node one = new Node(1); 
        Node two = new Node(2); 
        one.next= two; 
        boolean condition = isPalindrome(one); 
        System.out.println("isPalindrome :" + condition);
    }
    public static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;
    
        // Push all elements of the linked list onto the stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
    
        // Check if the linked list is palindrome
        current = head;
        while (current != null) {
            int ele = stack.pop();
            if (ele != current.data) {
                return false;  // If any comparison fails, return false
            }
            current = current.next;
        }
        
        return true;  // If all comparisons are successful, return true
    }
    
}
class Node  
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        next = null; 
        data = d; 
    } 
} 
