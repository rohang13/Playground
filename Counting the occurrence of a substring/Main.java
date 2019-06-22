import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int l1 = str1.length();
    int l2 = str2.length();
    int cnt = 0;
    for (int i = 0; i < (l1 - l2 + 1); i++)
    {
      boolean matching = true;
      for(int j = 0; j < l2; j++)
      {
        if(str1.charAt(i + j) != str2.charAt(j))
        {
          matching = false;
        }
      }
      if(matching == true)
      {
        cnt++;
      }
    }
    System.out.println(cnt);
  } 
}