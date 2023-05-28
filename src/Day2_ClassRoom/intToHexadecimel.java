package Day2_ClassRoom;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class intToHexadecimel {

	@Test
	public void example() {
		int num = 47;
		covertIntToDecimel(num);
	}

	private void covertIntToDecimel(int num) {

		//int temp = num % 16;

		// for(int i = 0; i<num;i++)
		while (num > 0) {
			int temp = num % 16;
			num = num / 16;
		}
		HashMap<Integer, String> keyValues = new HashMap<Integer, String>();
		keyValues(1,"")
		//System.out.println(num + "" + temp);
	}

}
