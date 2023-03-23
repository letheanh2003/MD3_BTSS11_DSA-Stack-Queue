package BT3_LTSD_Queue;

public class Solution extends Queue {
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null && rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
    }

    public void deQueue() {
        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
        }
    }

    public void displayQueue() {
        Node curNode = front;
        while (curNode != null) {
            System.out.println(curNode.data + " ");
            curNode = curNode.link;
        }

    }

    public boolean isFull() {
        return true;
    }

    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    @Override
    public String toString() {
        return "Solution{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
