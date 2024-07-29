package Task.junittask;

public class Task6 {
	
	public static int prime(int n) {
		
		int c=0;
        for(int i=2;i<=2*n*n;i++){
            int flag=0;
            for (int j = 2; j<=i/2;j++) {
                if (i % j == 0) {
                   flag=1;
                   break;
                }
            }
           if(flag==0){
               c++;
               if(c==n){
                 return i;
               }
           }
        }
		return 0;
	}
}
