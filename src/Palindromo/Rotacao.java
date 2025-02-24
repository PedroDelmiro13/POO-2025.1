package Palindromo;

public class Rotacao {
    public static void main(String[] args) {
        int[] arr = {12, 20, 40, 12, 15};
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int i: arr){
            System.out.println(i);
        }
    }
}
