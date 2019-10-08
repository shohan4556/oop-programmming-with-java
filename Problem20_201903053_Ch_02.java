import java.util.Date;
import java.text.SimpleDateFormat;

// Level 1 : 20
//Write a program to display today’s date in this format: 10 December 2008.

class Problem20_201903053_Ch_02 {
    public static void main(String args[]){
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(formatter.format(today));
    }
}