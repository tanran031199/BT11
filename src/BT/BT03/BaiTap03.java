package BT.BT03;


public class BaiTap03 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(10);
        queue.enQueue(7);
        queue.enQueue(50);
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.front.data);
        System.out.println(queue.rear.data);
        queue.displayQueue();
    }
}
