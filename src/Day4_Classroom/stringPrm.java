package Day4_Classroom;

import org.junit.Test;

public class stringPrm {
	
	@Test
	public void example()
	{
		String s = "1.1.1.1";
		changeToRefanged(s);
	}

	private void changeToRefanged(String s) {
		String temp = "";
		
		//s.toCharArray();
		
		//String  temp ="";
		for (String i : s.split(""))
		{
			if (i.equals(".")) 
			{
				temp = "[.]";
				System.out.println(temp);
			} 
			
		}
		System.out.print(temp);

	}
}
