import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class bai25 {

	public static void main(String[] args) {

	 Year yr = Year.now();
     System.out.println("\nCurrent Year: " + yr);  
     boolean isLeap = yr.isLeap();
     System.out.println("Is current year leap year? " + isLeap);  
     int length = yr.length(); 
     System.out.println("Length of the year: " + length+" days\n"); 
	}
}
