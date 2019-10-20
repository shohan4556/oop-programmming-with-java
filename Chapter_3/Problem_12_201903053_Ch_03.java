import java.util.Scanner;
// BMI calculator 

public class Problem_12_201903053_Ch_03{
    public static void main(String[] args){
        int weight;
        int height; 

        Scanner in = new Scanner(System.in); 
        System.out.println("Input Weight and Height");
        weight = in.nextInt();
        height = in.nextInt();

        double BMI = weight / Math.pow(height/100, 2);
        System.out.print("BMI ---> "+ (float)BMI);
    }
}