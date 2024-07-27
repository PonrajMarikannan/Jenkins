package Task.junittask;

public class task3 {
	
	public static boolean IO(int n) {
	   
		int a[]=new int[1000];
		int l=0;
		while(n!=0) {
			a[l++]=n%10;
			n=n/10;
		}
		for(int i=l-1;i>=0;i--) {
			int h=i;
			for(int j=i-1;j>=0;j--) {
				if(a[h]>a[j]) {
					return false;
				}else {
					h--;
				}
			}
		}
	   	return true;
	 }
}
