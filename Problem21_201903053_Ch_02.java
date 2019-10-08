// Repeat Exercise 20, but this time use this format: Monday December 10, 2008
import java.util.Date;
import java.text.SimpleDateFormat;

class Problem21_201903053_Ch_02{
    public static void main(String args[]){
        Date today = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("EEEE MMMM dd, yyyy");
        System.out.println(formater.format(today));
       
    }
}