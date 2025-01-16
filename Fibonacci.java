import java.util.*;
public class Fibonacci {
public static void main(String[] args) {
 int n=new Scanner(System.in).nextInt();
 System.out.print("a ");
 Fibo("a", "b",n-1 );
 System.exit(0);

}
public static void Fibo(String s1, String s2, int n ){
 if(n==0) 
   return; 
 System.out.print(s2 +" ");

  Fibo(s2,s2+s1, n-1);
  }
}
/* Example Input/Output 1:

Input: 6

Output:

Explanation:

Here N = 6 and the first two terms in the Fibonacci words are "a" and "b". The 3rd term in the Fibonacci words is ba ("b" + "a"). The 4th term in the Fibonacci words is bab ("ba" + "b"). The 5th term in the Fibonacci words is babba ("bab" + "ba"). The 6th term in the Fibonacci words is babbabab ("babba" + "bab").

Hence the output is*/