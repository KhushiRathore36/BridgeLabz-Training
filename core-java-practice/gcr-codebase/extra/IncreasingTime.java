package Extras;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class IncreasingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String inputDate=sc.next();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date=LocalDate.parse(inputDate,formatter);
        LocalDate increaseDate=date.plusDays(7);
        LocalDate increaseMonth=increaseDate.plusMonths(1);
        LocalDate finalDate=increaseMonth.plusYears(2);
        // Printing the date with adding 7 days,1 month,2 Year
        System.out.println(finalDate);
        LocalDate result=finalDate.minusWeeks(3);
        //printing the final result by subtracting 3 weeks
        System.out.println(result);
	}

}
