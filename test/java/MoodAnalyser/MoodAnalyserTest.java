package MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	

	@Test
	public void checkTheMood1() {
		MoodAnalyser newMood = new MoodAnalyser();
		String actualResult = MoodAnalyser.checkmood("I am in HAPPY Mood");
		Assert.assertEquals("SAD",actualResult);
	}
}
