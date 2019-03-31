import java.io.BufferedReader;
import java.io.*; 
import java.util.*; 
import java.io.InputStreamReader;


public class MirroredText{

	public static String readInput(){
		String phrase = null;
		try {
   			BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
			phrase = reader.readLine();
			
		} catch (IOException e) {
    			System.out.println("Can't read"); 
		}
		return phrase;
	}

	public static List<Character> convert(String string){
		List<Character> input = new ArrayList<Character>();
		for(int i = 0; i<string.length();i++){
			input.add(string.charAt(i));
		}
		return input;
		
	}

	public static boolean characterMatch(Character c1, Character c2){
		boolean b = false;
		if(c1==c2){
		b= true;
		}
		return b;
	}

	public static void main(String [] args){
		//Stack<Character> stack = new Stack<Character>();
		String rd = readInput();
		System.out.println(rd);
		List<Character> input = convert(rd);
		System.out.println(input);
		Stack<Character> stack = new Stack<Character>();
		int count =0;
		int subCount=0;
		int length = input.size();
		
		
		while(((count+1)<length)&&!(characterMatch(input.get(count),input.get(count+1)))){
		stack.push(input.get(count));
		count++;
		subCount = count +2;
		System.out.println("Count:" +count + " subcount " + subCount);
		}
		count =count+1;
		if(stack.size()>=2){

			ListIterator<Character>  iterator = stack.listIterator();
			while(iterator.hasNext()){
				
				if((subCount-2<input.size()) && (stack.pop()==input.get(subCount))){
					System.out.println("mirrored");
					subCount++;
				}else{
					System.out.println("not mirrored");
				}
				
				System.out.println("subCount"+subCount);
			}
				
			System.out.println("In stack");
		}
		
		
		
		
				

		
		
		
	}



}
