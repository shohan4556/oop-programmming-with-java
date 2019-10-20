import java.util.Scanner;
// Centimeter to feet and inches
public class Problem_7_201903053_Ch_03{
    public static void main(String[] args){
        final float f = 0.0328084f;    
        final float i = 0.393701f;

        Scanner in = new Scanner(System.in); 

        System.out.println("Centimeter :");
        float centimeter = in.nextFloat();
        
        float feet = centimeter * f;
        float inche = centimeter * i; 
        
        System.out.println(centimeter + "Centimeter = "+feet+"feet");
        System.out.println(centimeter + "Centimeter = "+inche+"inches");

    }
}