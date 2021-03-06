import java.util.Scanner;
public class Solution {

	public  boolean isPalindrone(int x) {
		if(x == 0) {
			return true;
		}
		if(x < 0 || x % 10 == 0) {	
			return false;
		}
		int rev = 0;
		while(x > rev) {
		rev = (rev * 10) + (x % 10);
		x = x / 10;
		}
		return (x == rev || x == rev / 10);
	}
	

	public static void main(String[] args)
	{
		System.out.print("Enter a number");
		//make scanner
		Scanner entry = new Scanner(System.in);
		int num = entry.nextInt();
		//call the methods
		Solution Palindrone = new Solution();
		
		System.out.println(Palindrone.isPalindrone(num));
		
	}
}
