package Palindromo;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vect = {3, 1, 7, 1, 2};
        int n = vect.length;
        int[] newVect =  new int[n];
        boolean repetido = false;
        for (int i = 0; i < n; i++) {
            repetido = false;
            for (int j = 0; j < i; j++) {
                if (newVect[j] == vect[i]) {
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                newVect[i] = vect[i];
            }
        }
        for (int i: newVect){
            System.out.print(i + " ");
        }
    }
}
