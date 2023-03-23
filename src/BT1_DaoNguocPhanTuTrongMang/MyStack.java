package BT1_DaoNguocPhanTuTrongMang;

import java.util.Arrays;

public class MyStack<E> {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError();

        }
        arr[index] = element;
        index++;
    }

    private boolean isFull() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int[] reverse() {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
