package BT5_ktrachuoi_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Stack stack = new Stack<>();
        String chuoi = "Able was I ere I saw Elba";
        chuoi = chuoi.toLowerCase();
        for (int i = 0; i < chuoi.length(); i++) {
            queue.add(chuoi.charAt(i));
            stack.push(chuoi.charAt(i));
        }
        boolean check =false;
        for (int i = 0; i < chuoi.length(); i++) {
            if (stack.pop()==queue.poll()){
                check = true;
            }else {
                check = false;
                System.out.println("No palindrome");
                break;
            }
        }
        if (check){
            System.out.println("Chuỗi palindrome");
        }


    }
}
