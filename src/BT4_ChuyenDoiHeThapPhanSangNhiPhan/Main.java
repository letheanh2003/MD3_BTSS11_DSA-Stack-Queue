package BT4_ChuyenDoiHeThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số muốn chuyển: ");
        int number = scanner.nextInt();
        ConvertDecimalToDecimalSystem(number);
    }
    private static void ConvertDecimalToDecimalSystem(int number) {
        Stack stack = new Stack<>();
        String banary = "";
        if (number == 0) {
            banary = "0";
        } else
            while (number > 0) {
                stack.push(number % 2);
                number = number / 2;
            }
        while (!stack.isEmpty()) {
            banary += stack.pop();
        }
        System.out.println("Chuyển Sang Hệ Nhị Phân: "+banary);
    }
}

