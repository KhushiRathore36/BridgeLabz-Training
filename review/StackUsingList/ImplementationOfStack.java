package StackUsingList;
import java.util.*;
public class ImplementationOfStack {
    public static ArrayList<Integer> stack;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        stack=new ArrayList<>();
        push(1);
        push(2);
        push(3);
        push(4);
        System.out.println(peek());
        System.out.println(isEmpty());
        System.out.println(size());
        System.out.println(pop());
        System.out.println(size());
        
        
	}
    public static void push(int value) {
    	stack.add(value);
    }
    public static int size() {
    	return stack.size();
    }
    public static boolean isEmpty() {
    	if(stack.size()==0) {
    		return true;
    	}
    	return false;
    }
    public static int pop() {
    	if(stack.size()==0) {
    		System.out.println("stack is underflow");
    		return -1;
    	}
    	
    	int val=stack.get(stack.size()-1);
    	stack.remove(stack.size()-1);
    	
    	return val;
    }
    public static int peek() {
    	return stack.get(stack.size()-1);
    }
}
