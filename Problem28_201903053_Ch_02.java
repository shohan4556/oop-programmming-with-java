import java.util.Scanner;

// Write a program that accepts a word and prints out the middle character.

class Problem28_201903053_Ch_02{
    public static void main(String aString[]){
       Scanner in = new Scanner(System.in);
       String word;
       word = in.nextLine();
       int mid = word.length() / 2;  
       System.out.println(word.charAt(mid));     
    }
}