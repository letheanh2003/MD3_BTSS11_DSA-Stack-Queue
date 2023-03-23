package BT2_DemSoLanXuatHienCuaMoiPhanTu;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi của bạn: ");
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (treeMap.get(text.charAt(i)) == null) {
                treeMap.put(text.charAt(i), 1);
            } else {
                treeMap.replace(text.charAt(i), treeMap.get(text.charAt(i)) + 1);
            }
        }
        System.out.println(treeMap);
    }
}
