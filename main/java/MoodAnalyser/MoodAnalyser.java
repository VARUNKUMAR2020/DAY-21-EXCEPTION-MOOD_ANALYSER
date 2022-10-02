package MoodAnalyser;

import java.util.Scanner;

public class MoodAnalyser {
	public static String nullPointer(String Mood ) {
		try {
			if (Mood.toLowerCase().contains("happy"))
				System.out.println("HAPPY MOOD");
			else
				System.out.println("SAD MOOD");
		} catch (NullPointerException e) { 
			System.out.println("HAPPY");
		}
		    return "HAPPY";
		
	}

	public static void main(String[] args) {
		System.out.println("EXCEPTION HANDLING");
		String myMood = null;
		nullPointer(myMood);

	}
}

