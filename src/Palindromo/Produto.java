package Palindromo;

public class Produto {
    public static void main(String[] args) {
        int [] vect = {5,6,8,9};
        int [] vetor = {5,2,4,3};
        int n = vect.length;
        int[] array = new int[n];
        int produto = 0;
        for (int i = 0; i<array.length; i++){
            for(int j = 0; j<vetor.length; j++){
                produto = vect[i]*vetor[i];
            }
            array[i] = produto;
        }
        for(int i :array){
            System.out.println(i);
        }
    }
}
