package EmailValidation;
import java.util.*;
import java.util.Scanner;

public class emailValidation {

	public static void main(String[] args) {
		
		ArrayList<String> emailList = new ArrayList<String>();
		int a=0;
		
		emailList.add("abc123@gmail.com");
		emailList.add("sample11@gmail.com");
		emailList.add("flash55@yahoo.com");
		emailList.add("abc123@hotmail.com");
		emailList.add("john@gmail.com");
		
		Scanner mail = new Scanner(System.in);
		
		System.out.println("Enter your email Id - ");
		
		String inputMail = mail.nextLine();
		
		
		Iterator<String> itr = emailList.iterator();
		
		for (int i = 0; i < emailList.size(); i++) {
			 
            if(emailList.get(i).equals(inputMail)) {
            	a+=1;
            }
        }
		
		if(a==1) {
			System.out.println("Email Validation successfull!!!");
		}
		else {
			System.out.println("Oops...Invalid email!!!");
		}
		
	}

}
