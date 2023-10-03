package BT.BT03;

public class Queue implements Solution {
    Node front;
    Node rear;

    @Override
    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            rear.link = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
            newNode.link = front;
        }
    }

    @Override
    public Integer deQueue() {
        if (front == null) {
            return null;
        }

        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }

        return data;
    }

    @Override
    public void displayQueue() {
        if (front == null) {
            System.out.println("..........");
            return;
        }
        ;

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }
}
