package tempLoggerPackage;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GettingCurrentDate {
	public static void main(String[] args) {
		System.out.println(CurrentDate(1));
   	}
   
   	public static String CurrentDate(int type) {
	   	//Variables
	   	DateFormat df;
	   	switch (type) {
	   		case 1: df = new SimpleDateFormat("dd:MM:yy");
	   		break;
	   
	   		case 2: df = new SimpleDateFormat("HH-mm-ss");
	   		break;
	   
	   		default: df = new SimpleDateFormat("dd:MM:yy_HH-mm-ss");
	   	}
	   
       	// Getting current date and time using Date class
       	Date dateobj = new Date();
       
       	// Printing date/time
       	System.out.println("Curret date and time: " + df.format(dateobj));
	   
       	// Returning date/time
       	return df.format(dateobj);
   	}
}
