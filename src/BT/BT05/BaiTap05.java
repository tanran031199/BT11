package BT.BT05;

import java.util.*;

public class BaiTap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String input = sc.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.offer(input.charAt(i));
        }

        boolean isPalindrome = false;
        for (int i = 0; i < input.length() / 2; i++) {
            if (stack.pop() == queue.poll()) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Đây là chuỗi isPalindrome");
        } else {
            System.out.println("違う");
        }
    }
}
