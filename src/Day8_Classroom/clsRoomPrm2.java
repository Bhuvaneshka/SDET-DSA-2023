package Day8_Classroom;

import java.util.HashMap;

public class clsRoomPrm2 {
	public static void main(String[] args) {
		String s = "3[a2[bc]]";
		char element;
		int size = s.length();
		Stack stack = new Stack();
		stack.push('3');
		stack.push('[');
		stack.push('a');
		stack.push('2');
		stack.push('[');
		stack.push('b');
		stack.push('c');
		stack.push(']');
		stack.push(']');
		
		HashMap<Character,Character> openMap = new HashMap<>();
		openMap.put('{', '}');
		openMap.put('(', ')');
		openMap.put('[', ']');
		
		
		for (int i = 0; i < s.length(); i++) {
			if(openMap.containsKey(s.charAt(i)))
			{
				stack.push
			}
		}
		
	}
}
