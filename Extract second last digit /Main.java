import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int t=n%100;
      int r=t/10;
      System.out.println(r);
	}
}