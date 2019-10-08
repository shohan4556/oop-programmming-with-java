import java.util.Scanner;

// Write a program that accepts a string input and outputs the number of
// characters in the string and the first and last character in separate lines.

class Problem27_201903053_Ch_02{
    public static void main(String aString[]){
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){
            String text;
            text = input.nextLine();
            System.out.println(" Total Character : " + text.length()+ " First Character : " + text.charAt(0) + " Last Character: "+ text.charAt(text.length()-1) );
        }
    }
}