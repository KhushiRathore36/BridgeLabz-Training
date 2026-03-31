package StringBuffer;
import java.util.*;
public class CompareStringBufferWithStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder sb=new StringBuilder();
        long startStringBuilder=System.nanoTime();
        for(int i=0;i<=1000000;i++) {
        	sb.append("hello");
        }
        long endStringBuilder=System.nanoTime();
        long totalStringBuilder=endStringBuilder-startStringBuilder;
        StringBuffer sf= new StringBuffer();
        long startStringBuffer=System.nanoTime();
        for(int i=0;i<=1000000;i++) {
        	sf.append("hello");
        }
        long endStringBuffer=System.nanoTime();
        long totalStringBuffer=endStringBuffer-startStringBuffer; 
        System.out.println("the time taken by string builder to concatenate 1 million string: "+totalStringBuilder/1000000);
        System.out.println("the time taken by string buffer to concatenate 1 million string: "+totalStringBuffer/1000000);
	}

}
