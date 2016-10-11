import java.util.*;
import java.io.*;

public class NameReversalTest {

	public static void main(String[] args) {
		Scanner XavReader=new Scanner(System.in);
		System.out.println("Please enter your name here"
				+ " to reverse it: ");
		String name=XavReader.nextLine();
		String reverse = "";
		String nameReverse = reverse(name);
		//System.out.println(nameReverse);
		
	}
	
	
	
	public static String reverse(String x){
		String container = "";
		
		for (int i= 0; i < x.length(); i++) {
			container = x.substring(x.length()-1-i, x.length()-i);
			System.out.print(container.toLowerCase());	
			
	}
		return container.toLowerCase();
	

	}

}
