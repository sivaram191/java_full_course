import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter which day in a week");
	    int n = s.nextInt();
	    String day;
	    switch(n)
	    {
	        case 1:
	            day="monday";
	            break;
	       case 2:
	           day="tuesday";
	           break;
	       case 3:
	            day="wednesday";
	            break;
	       case 4:
	           day="thursday";
	           break;
	       case 5:
	            day="friday";
	            break;
	       case 6:
	           day="Saturday";
	           break;
	       case 7:
	            day="sunday";
	            break;
	       default:
	            day="Invailed day";
	            break;
	    }
	    System.out.println("today".concat(" ").concat("is").concat(" ").concat(day));
		
	}
}
