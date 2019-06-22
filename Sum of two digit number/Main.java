import java.util.*;
class Main {
	public static void main (String[] args) {
		
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int f=n/10;
      int s=n%10;
      int sum= f+s;
      System.out.println(sum);
	}
}