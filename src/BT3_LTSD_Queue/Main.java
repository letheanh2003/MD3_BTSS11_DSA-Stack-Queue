package BT3_LTSD_Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(1);
        solution.enQueue(2);
        solution.enQueue(3);
        solution.enQueue(4);
        solution.deQueue();
        solution.displayQueue();
    }
}
