import java.util.Scanner;


public class Mario {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		System.out.println("Princess Peach is kidnapped again by Bowser! Help Mario to save her!");
		System.out.println("Press any key!");
		
		Scanner s = new Scanner(System.in);
		sb.append(s.nextLine());
		s.close();
		
		System.out.println( sb.substring(sb.length()) );
		int start = 0;
		int end = 10;
		String str = sb.substring(start, end);
		System.out.println("Results:" + str);
		
		
		String str1 = " ";
		int fromIndex = 0;
		int index = sb.indexOf(str1, fromIndex);
		System.out.println("index:" + index);

		String result = sb.substring(start,sb.length());

		System.out.println("Result:" + result);
	}
}
