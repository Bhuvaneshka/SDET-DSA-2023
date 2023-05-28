package Day2_ClassRoom;

import org.junit.Test;

public class CovertIntToHexa {

	@Test
	public void example()
	{
		int n = 47;
		System.out.println(convertIntToHexa(n));
		System.out.println((n));

	}

	private String convertIntToHexa(int n) {
	    String output = "";
	    String finals="";
	    while(n>0)
	    {
	    	int remainder = n%16;
	    	finals = getHexa(remainder);
	    	n = n/16;
	    	System.out.print(n);
	    	//output = getHex(remainder)+ out
	    }
	   
		return finals;
	}

	private String getHexa(int remainder) {
	    switch(remainder) {
	      case 10: return "A";
	      case 11: return "B";
	      case 12: return "C";
	      case 13: return "D";
	      case 14: return "E";
	      case 15: return "F";
	      default: return remainder + "";
	    }
	}
}
