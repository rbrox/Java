import java.util.*;
import java.util.Scanner;
// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    //Stack
    
    
    //Push
    static void push(char []stack, int top,char ele){
        if (top == stack.length){ 
        }
        else{
            stack[top] = ele;
            ++top;
        }
    }
    
    //Pop
    static boolean pop(char []stack, int top,char ele){
    //Check
    boolean flag;
    if(ele == '}'){
        if(stack[top] == '{')
            flag = true;
        else
            flag = false;
    }
    else{
        if(stack[top] == '(')

            flag = true;
        else
            flag = false;
    }
    --top;
    return flag;
    }

    static String isBalanced(String s){
        int top = -1;
        final int LEN = 100; 
        char stack[] = new char[LEN];

        for (int i = 0; i < s.length(); ++i){
            char val = s.charAt(i);
            
            if (val == '{' || val == '('){
                push(stack, top, val);
            }
            else{
                pop(stack, top)
            }
        }
      
        
        
    
    }
class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
