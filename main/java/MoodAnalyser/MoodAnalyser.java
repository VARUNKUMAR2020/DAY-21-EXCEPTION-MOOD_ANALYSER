package MoodAnalyser;

import java.util.Scanner;

public class MoodAnalyser {
	static String analyseMood(String checkmood) {
		if (checkmood.toLowerCase().contains("happy")) {
			System.out.println("HAPPY MOOD");
		} else {
			System.out.println("SAD MOOD");
		}
		return "HAPPY";
	}

	public static void main(String[] args) {
		System.out.println("EXCEPTION HANDLING");
		Scanner analyse = new Scanner(System.in);
		System.out.println("ENTER THE MOOD YOUR:  ");
		String Mood = analyse.nextLine();
		analyseMood(Mood);
	}
}
