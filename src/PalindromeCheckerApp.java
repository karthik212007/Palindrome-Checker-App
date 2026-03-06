import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input1 = "madam";
        String input2 = "level";


        boolean isPalindrome1 = check(input1, 0, input1.length() - 1);
        System.out.println("Input: " + input1);
        System.out.println("Is Palindrome (recursive)? " + isPalindrome1);


        boolean isPalindrome2 = checkWithLinkedList(input2);
        System.out.println("Input: " + input2);
        System.out.println("Is Palindrome (LinkedList)? " + isPalindrome2);
    }

    // Recursive approach
    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }


    private static boolean checkWithLinkedList(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}
