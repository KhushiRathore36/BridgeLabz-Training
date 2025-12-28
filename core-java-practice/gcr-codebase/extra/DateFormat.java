package Extras;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String inputDate="25-12-2025";
        DateTimeFormatter inputFormatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        System.out.println(formatter);
        System.out.println(formatter1);
        System.out.println(formatter2);
        
	}

}
