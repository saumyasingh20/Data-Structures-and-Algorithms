package stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class BalancedParantheses {
	
	private final static Set<Character> openingBrackets = Set.of('(','{','[');
    private final static Set<Character> closingBrackets = Set.of(')','}',']');
    private final static Map<Character,Character> closedVsOpenBrackets = Map.of(')','(','}','{',']','[');
    
    
    public static boolean validBrackets(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(Character i: s.toCharArray()) {
    		if(openingBrackets.contains(i)) {
        		stack.push(i);
        	}else if (closingBrackets.contains(i)) {
        		if(stack.isEmpty()) {
        			return false;
        		}
        		Character lastOpeningBracket=stack.peek();
        		if(closedVsOpenBrackets.get(i).equals(lastOpeningBracket)) {
        			stack.pop();
        		}else {
        			return false;
        		}
        	}
    	}
    
    	return true;
    	
    }
    
    public static void main(String[] args) {
		String str = "()[{}()]";
		String str2= "([)";
		System.out.println(validBrackets(str));
		System.out.println(validBrackets(str2));
	}
    
    
   
}
