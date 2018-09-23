public class ReverseInteger{
	public static void main(String args[]){
		System.out.println(Solution.reverse(1534236469));
	}
}

class Solution{
	public static int reverse(int x){
		long numberStore[] = new long[100];
		int numberSize = 0;
		long currentLoc;
		boolean positive = true;
		if (x<0){
			positive = false;
			x = 0-x;
		}
		long fakeX = (long)x;
		while(fakeX != 0){
			currentLoc = ((fakeX%getPower(numberSize+1))/getPower(numberSize));
			fakeX -= currentLoc * getPower(numberSize);
			numberStore[numberSize++] = currentLoc;
		}
		numberSize --;
		int newMul = 0;
		long sum = 0;
		while(numberSize>=0){
			sum += numberStore[numberSize--]*getPower(newMul++);
		}
		if(sum <= -2147483648L || sum>= 2147483648L)
		    return 0;
		if(positive){
			return (int)sum;
		}
		else{
			return (int)(0-sum);
		}
	}

	private static long getPower(int x){
        	long sum = 1;
        	while(x>0){
            		sum *= 10L;
           		x --;
        	}
		return sum;
	}
}
