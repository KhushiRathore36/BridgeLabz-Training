package leetcodeBase;
import java.util.*;
public class ValidParenthesis {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		    String s=sc.next();
		    System.out.println(checkValidString(s));
	}
  public static boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> ast=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else if(ch=='*'){
                ast.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!ast.isEmpty()){
                    ast.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!st.isEmpty() && !ast.isEmpty()){
            if(st.peek()>ast.peek()){
                return false;
            }
            st.pop();
            ast.pop();
        }
        return st.isEmpty();
    }
}
