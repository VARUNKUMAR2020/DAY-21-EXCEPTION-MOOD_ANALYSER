package MoodAnalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser newMood = new MoodAnalyser();

	@Test
	public void checkTheMood() {
		String mood = newMood.analyseMood("I am sad");
		Assert.assertTrue(mood,true);
	}
}
