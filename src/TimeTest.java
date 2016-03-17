import static org.junit.Assert.*;

import org.junit.Test;


public class TimeTest {

	@Test
	public void HourTest() {
		try {
			Time t = new Time(-1, 0);
		} catch (TimeException te) {
			assertEquals(te.toString(), "Time Exception Error: Invalid Hour");
		}
	}
	
	@Test
	public void MinuteTest() {
		try {
			Time t = new Time(0, -1);
		} catch (TimeException te) {
			assertEquals(te.toString(), "Time Exception Error: Invalid Minute");
		}
	}
}
