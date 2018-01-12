package tempLoggerPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;



public class CSVOutput {
    public static void main(String[] args) throws FileNotFoundException{
    	// Variables
    	int limit = 20;
    	String[] columns = {"time", "temp"};
    	
		// Creating the input array
    	int[] input = {};
    	
    	// Separate because this is just a demo showing how to output to a .csv file with values.
    	// Replace 'RandomArray(limit)' with whatever array you want to show in your file.
		input = RandomArray(limit);
    	
    	// Giving the array to Output
    	Output(input, limit, "tempLog", columns);
    }
    
    public static int[] RandomArray(int limit) {
    	// Time can be substituted for a time checking device
    	int time = 0;
    	
		int[] output = {};
		Random rand = new Random();
    	
		// Setting size of array
		output = new int[limit + 1];
		System.out.println("setting random values...");
		
		// Making an array of random numbers
    	while (time <= limit) {
    		output[time] = rand.nextInt(200) + 100;
    		System.out.println("Time: " + time + " Temp: " + output[time]);
    		
    		time ++;
    	}
    	
    	// Returning an array of random numbers
    	return output;
    }
    
    public static void Output(int[] input, int limit, String title, String[] columns) throws FileNotFoundException{    
    	boolean demo = true;
    	
    	// Defining printing variables
    	System.out.println("starting print...");
    	
    	// Setting columns up
    	columns = new String[2];
    	
    	// Returns FileNotFoundException??
        //PrintWriter pw = new PrintWriter(new File(title + GettingCurrentDate.CurrentDate(0) + ".csv"));
    	title += "_" + GettingCurrentDate.CurrentDate(0);
    	if (demo) {
    		title += "_demo";
    	}
    	
        PrintWriter pw = new PrintWriter(new File("./output", title + ".csv"));
        StringBuilder sb = new StringBuilder();
        
        // Starting two columns
        //sb.append(column1);
        sb.append(columns[0] + ',' + columns[1]);
        //sb.append(column2);
        sb.append('\n');
        
        // Printing array
        for (int i = 0; i <= limit; i ++) {
        	sb.append(i);
        	sb.append(',');
        	sb.append(input[i]);
        	sb.append('\n');
        }
        
        // Writing to file and closing
    	pw.write(sb.toString());
    	pw.close();
        System.out.println("done!");
        System.out.println("printed " + title + ".csv");
    }
}
