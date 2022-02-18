package com.codethales.arrayunidimensional;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = {2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] vr = new int[9];
        for (int i = 0; i < vr.length; i++) {
            vr[i] = v1[i] * v2[i];
        }
        for (int i = 0; i < vr.length ; i++) {
            System.out.print(vr[i] + " | ");
        }
    }
}
