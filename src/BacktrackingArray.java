import javax.swing.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static java.lang.Math.*;

public class BacktrackingArray implements Array<Integer>, Backtrack {
    private Stack stack;
    private int[] arr;
    private int nextVal;

    // Do not change the constructor's signature
    public BacktrackingArray(Stack stack, int size) {
        this.stack = stack;
        arr = new int[size];
        nextVal = 0;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("index is out of bounds");
        }
        return (arr[index]);
    }

    @Override
    public Integer search(int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void insert(Integer x) {
        if (nextVal == arr.length) {
            throw new IllegalArgumentException("array is full");
        }
        int[] memo = {1, x, nextVal};
        stack.push(memo);
        arr[nextVal] = x;
        nextVal++;
    }

    @Override
    public void delete(Integer index) {
        if (nextVal < index || index <= 0)
            throw new IllegalArgumentException("index is out of bounds");

        int[] memo = {0, arr[index],index};
        stack.push(memo);
        nextVal--;
    }

    @Override
    public Integer minimum() {
        if (nextVal == 0) {
            throw new IllegalArgumentException("array is empty");
        }
        int min = 0;
        for (int i = 1; i < nextVal; i++) {
            if (arr[i] < arr[min])
                min = i;
        }
        return min;
    }

    @Override
    public Integer maximum() {
        if (nextVal == 0) {
            throw new IllegalArgumentException("array is empty");
        }
        int max = 0;
        for (int i = 0; i < nextVal ; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    @Override
    public Integer successor(Integer index) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("index is out of bounds");
        }
        if (nextVal == 0) {
            throw new NoSuchElementException("array is empty");
        }
        if (index == maximum()) {
            return -1;
        }

        int secc = maximum();
        for (int i = 0; i < nextVal; i++) {
            if (arr[i] < arr[secc] & arr[i] > arr[index])
                secc = i;
        }
        return secc;
    }

    @Override
    public Integer predecessor(Integer index) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("index is out of bounds");
        }
        if (nextVal == 0) {
            throw new IllegalArgumentException("array is empty");
        }
        if (index == maximum()) {
            return -1;
        }

        int prede = minimum();
        for (int i = 0; i < nextVal; i++) {
            if (arr[i] > arr[prede] & arr[i] < arr[index])
                prede = i;
        }
        return prede;
    }

    @Override
    public void backtrack() {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("there are no steps to undo");
        }
        int[] temp = (int[])stack.pop();
        if (temp[0] == 0) {
            insert(temp[1]);
            stack.pop();
        }
        else {
            int index = search(temp[1]);
            delete(index);
            stack.pop();
        }
    }

    @Override
    public void retrack() {
        /////////////////////////////////////
        // Do not implement anything here! //
        /////////////////////////////////////
    }

    @Override
    public void print() {
        String ans = "";
        for (int i = 0; i < nextVal; i++) {
            ans = ans + arr[i] + " ";
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        BacktrackingArray temp = new BacktrackingArray(stack, 100);
        temp.insert(-2);
        System.out.println(temp.successor(0));
        System.out.println(temp.maximum());
        temp.delete(1);
    }
}
