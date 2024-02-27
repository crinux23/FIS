package packg;

import java.util.Scanner;

public class main {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ajutor a = new ajutor();

		String data= scan.nextLine();
		
		if(data == "Hello")
			a.afisare();
		else if(data =="info")
			a.info();
		else if (data == "exit")
			return null;	
	}

}
