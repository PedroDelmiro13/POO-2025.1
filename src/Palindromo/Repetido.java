package Palindromo;

public class Repetido {
    public static void main(String[] args) {
        int[] arr = {12, 20, 40, 12, 20, 15};
        int n = arr.length;
        int[] vect = new int[n];
        Boolean repete = false;
        for (int i = 0; i<n; i++){
            repete = false;
            for(int j = 0; j < i; j++){
                if(vect[j] == arr[i]){
                    repete = true;
                    break;
                }
            }
            if(!repete){
                vect[i] = arr[i];
            }
        }
        for(int i: vect){
            System.out.println(i);
        }
    }
}

