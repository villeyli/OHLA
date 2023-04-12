package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSecToTime {
	
	
	@ParameterizedTest(name="Seconds to time")
	@CsvSource({"3600, 1:00:00", "5400, 1:30:00", "0, 0:00:00", "86399, 23:59:59", "90000, -1", "300, 0:05:00", "1, 0:00:01"})
	public void secToTimeTest(int seconds, String value) {
		assertEquals(value, TimeUtils.secToTime(seconds), "Time was faulty");
	}
}
