/**
 * Java 1 Homework 3
 *
 * @author Irina
 * @version 04.04.2022
 */
 import java.util.Arrays;
 
 class HomeWorkApp3_bond {
    public static void main(String[] args) {
        
        invValArr();
        hundredArr();
        changArr();
        sqDiag();
        lenWithVal(10, 11);
    }
    
    static void invValArr() {
        int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void hundredArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void changArr() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
            arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void sqDiag() {
        int[][] arr = new int[5][5];
        for(int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i -1] = 1;
            }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    
    static void lenWithVal(int len, int initialVal) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = initialVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}