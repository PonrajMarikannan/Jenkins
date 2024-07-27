package Task.junittask;

public class task2 {
	
	public static int MOD(int n) {
	    int max = 0;
	   	while(n!=0) {
	    	 if(max<n%10) {
	    		 max = n%10;	    		 
	    	 }
	    	n=n/10;
	    }
	   	return max;
	 }
}
