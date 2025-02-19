package Palindromo;

import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {
    public static Boolean isPalindrom(String s){
        int n = s.length();
        for (int i = 0; i < n/2 ; i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(n - i - 1))) {
                return false;
            }
        }
        return true;
    }
    public static String removeSpecialCharacters(String s){
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[^a-zA-Z0-9]","");
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra ou frase para verificacão");
        String s = sc.nextLine();
        String verificaAcento = removeSpecialCharacters(s);
        if(isPalindrom(verificaAcento)){
            System.out.println("É um palindromo");
        }else{
            System.out.println("Não é um palindromo");
        }
        System.out.println(removeSpecialCharacters(s));
        sc.close();
    }
}
