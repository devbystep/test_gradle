package by.minsler;

import java.util.List;
import java.util.Arrays;

public class Skradnik {

	private static List<String> users = Arrays.asList("Dima", "Dima", "Lesha");

	public static void printUsers(){
		for(String user: users){
			System.out.println(user);
		}
	}

	public static boolean returnTrue(){
		return true;
	}

}