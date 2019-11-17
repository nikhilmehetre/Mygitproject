package TutorialPractice;
import java.util.Arrays;

public class JavaBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname= "abc";
		String lname= "ABC";
		String text = "I love you Jyotsna";
		System.out.println(fname.equalsIgnoreCase(lname));
		
		String[] names= text.split("o");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
