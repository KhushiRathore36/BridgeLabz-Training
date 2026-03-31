package Extras;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateComparater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String inputDate=sc.next();
        String secondInputDate=sc.next();
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(inputDate, formatter);
        LocalDate date2 = LocalDate.parse(secondInputDate, formatter);
        if(date1.isBefore(date2)) {
        	System.out.println("first input date is come before second input date");
        }
        else if(date1.isAfter(date2)) {
        	System.out.println("second input date is come before first input date");
        }
        else if(date1.isEqual(date2)) {
        	System.out.println("both date are same");
        }
	}

}
