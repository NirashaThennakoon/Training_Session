import java.io.BufferedReader;
import java.io.*; 
import java.util.*; 
import java.io.InputStreamReader;


public class MirroredText{

	public static String readInput(){
		String phrase = null;
		try {
   			BufferedReader reader= new BufferedReader(new InputStreamReader			(System.in));
			phrase = reader.readLine();
			
		} catch (IOException e) {
    			System.out.println("Can't read a"); 
		}
		return phrase;
	}

	public static void pushStack(String str){
		Stack<Character> stack = new Stack<Character>();
		int i =0;
		//System.out.println(str.charAt(i));
		
		while(!(str.charAt(i) == str.charAt(i+1))){
		Boolean b = (str.charAt(i) == str.charAt(i+1));
		System.out.println(b);
			
	
			stack.push(str.charAt(i));
			i++;

		}
		
		System.out.println(stack);
	}
	public static void main(String [] args){
		
		String rd = readInput();
		System.out.println(rd);
		pushStack(rd);
		
		
	}



}