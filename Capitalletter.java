import java.util.*;
public class Capitalletter {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("input your sentence");
		String sen=obj.nextLine();
		String upper_case_line=" ";
		   Scanner lineScan=new Scanner(sen);
		    while(lineScan.hasNext()) {
		    	String word=lineScan.next();
		    	upper_case_line += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
		    }
		    System.out.println(upper_case_line.trim());

		
	}

}
