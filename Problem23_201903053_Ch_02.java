import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

//Display the current time in the title of a frame window using this format: 12:45:43 PM 

class Problem23_201903053_Ch_02{
    public static void main(String args[]){
        Date today = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss");

        JFrame window = new JFrame();
        window.setSize(300,300);
        window.setTitle(formater.format(today).toString());
        window.setLocation(50,50);
        window.setVisible(true);
    }
}