package ru.mirea.lab101;

import java.util.ArrayList;

import java.util.Collections;

public class Sequence {
    int n;
    ArrayList<Integer> myList = new ArrayList<>();

    Sequence() {

    }

    public void output(int n) {
        this.n = n;
        for (int i = n; i > 0; i--) {
            int t = 0;
            while (t < n) {
                myList.add(n);
                t++;
            }

            n--;
        }
    }

    public void sort() {
        Collections.sort(myList);
        int a = myList.size();
        for (int i = 0; i < a; i++) {
            System.out.print(myList.get(i));
        }

    }

}
