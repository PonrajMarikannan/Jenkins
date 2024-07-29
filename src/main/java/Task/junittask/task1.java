package Task.junittask;

public class Task1 {
	
	 public static int SumOfDigits(int n) {
	    int total = 0;
	   	while(n!=0) {
	    	total += n%10;
	    	n=n/10;
	    }
	   	return total;
	 }
}
