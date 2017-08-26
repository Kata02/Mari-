package SuperMario;
import java.util.Scanner;


public class Mario {

	public static void main(String[] args) {
		
		
		
		System.out.println("Princess Peach is kidnapped again by Bowser! Help Mario to save her!");
		System.out.println("Please write to the task!");
		
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		sb.append(s.nextLine());
		s.close();
		System.out.println("Contents of StringBuilder:" + sb);
		
		/*Object obj = new String(" is a string");
		sb.append(obj);
		System.out.println("Value after adding object:"+sb);
		
		int start = 2;
		int end = 5;
		String str = "TRATUTO";

		// Replace the characters from index 2 to index 5
		sb.replace(start, end, str);
		System.out.println("New Contents of StringBuilder object:" + sb);

*/
//String br = sb.toString();
		
		//System.out.println("Contents of StringBuilder:" + sb);
		//System.out.println( sb.indexOf("piranja") );
		//System.out.println( sb.substring(sb.length()) );
		/*
		int start = 0;
		int end = 01;
		String str = sb.substring(start, end);
		System.out.println("Results:" + str);
		
		*/
		String str = " ";
		int fromIndex = 10;
		int index = sb.indexOf(str, fromIndex);
		System.out.println("index:" + index);
				
			
		String result = sb.substring(0,sb.length());
		System.out.println("Result:" + result);
		/*	
		sb.append(" ");
		System.out.println("Contents of StringBuilder:" + sb);

		int index2 = 0;
		char ch = ' ';

		// change the character at index 15
		sb.setCharAt(index2, ch);
		System.out.println("New Contents of StringBuilder:" + sb);
		sb.append("-");
		System.out.println("Value after adding string:"+sb);
		
		*/
		/*Egy adott StringBuilder bármelyik karakterét megkaphatjuk a charAt(i) metódussal, ahova az i helyére írjuk be, hogy hányadik karaktert szeretnénk megkapni. A karakterek indexelése a tömbökhöz hasonlóan 0-val kezdõdik. Fontos, hogy ez egy karakter típust ad vissza! Bármely StringBuilder elsõ karaktere az sb.charAt(0), az utolsó pedig az sb.charAt( sb.length()-1 )
		StringBuilder sb = new StringBuilder("abrakadabra");*/
		System.out.println(sb.charAt(3)); // a 4. karakter (3-as index!)
		//sb.charAt(0); // 1. (üres StringBuilder-nél indexelési hiba!)
		//sb.charAt( sb.length()-1 ); // utolsó karakter
		
		System.out.println( sb.indexOf("p") ); 
/*
System.out.println( sb.lastIndexOf("piranja") );
String str = "a";
int fromIndex = 10;
int index = sb.indexOf(str, fromIndex);
System.out.println("index:" + index);*/

System.out.println( sb.substring(0,7) ); 

		
		
		



		
	}
}




	

			
		