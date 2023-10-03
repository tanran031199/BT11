package BT.BT01;

import java.util.PriorityQueue;
import java.util.Queue;

public class BaiTap01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(10);
        queue.offer(2);
        queue.offer(75);
        queue.offer(9);
        queue.offer(23);
        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
