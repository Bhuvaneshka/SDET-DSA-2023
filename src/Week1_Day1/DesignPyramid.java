package Week1_Day1;

import java.awt.print.Printable;

import org.junit.Test;

public class DesignPyramid {

//	Pyramid Program
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * *
	@Test
	private void example() {
		int n = 5;
		drawPyramid(n);
	}

	private void drawPyramid(int n) {
		//Loop for n items
		for(int i = 1; i<=n;i++)
		{
			//print the speace
			for(int s=1; s<n-1;s++)
			{
				System.out.print(" ");
			}
			
			//print the '*'
			for(int j = 1; j==i;j++)
			{
				System.out.print("*");
			}			
		}
	}

}
