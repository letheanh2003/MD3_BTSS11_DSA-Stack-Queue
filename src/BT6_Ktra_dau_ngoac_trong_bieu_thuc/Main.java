package BT6_Ktra_dau_ngoac_trong_bieu_thuc;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập Vào Đây: ");
        String expression = new Scanner(System.in).nextLine();
        Boolean check = isTrueBacked(expression);
        System.out.println(check);

    }

    public static boolean isTrueBacked(String expression) {
        Stack<Character> listCharacter = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                listCharacter.push(expression.charAt(i));
            }
            if (expression.charAt(i) == ')') {
                if (listCharacter.isEmpty()) {
                    return false;
                }
            }
        }
        if (listCharacter.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMatcher(char c) {
        if (c == ')') {
            return true;
        } else {
            return false;
        }
    }
}
