package Palindromo;

import java.util.Scanner;

public class Palindromo {
    public static String isPalindrom(String s){
        int n = s.length();
        for(int i=0; i< n/2; i++){
            for(int j=s.length()-1; j>i; j--){
                if(Character.toLowerCase(s.charAt(j))!=Character.toLowerCase(s.charAt(i))){
                    System.out.println("Não é um palindromo");
                    return "falso";
                }
                System.out.println("É um palindromo");
            }
        }
        return s;
    }
    public static void removeSpecialCharacters(String s){
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removeSpecialCharacters(isPalindrom(s));
        System.out.println(s);
        sc.close();
    }
}
