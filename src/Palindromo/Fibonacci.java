package Palindromo;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = arr.length;
        arr[0]= 0;
        arr[1]= 1;
        for(int i = 2; i < n ; i++){
            int temp = arr[i-1] + arr[i-2];
            arr[i] = temp;
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
