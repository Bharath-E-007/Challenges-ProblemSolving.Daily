import java.util.*;
public class Pattern {
public static void main(String[] args) {
int size=new Scanner(System.in).nextInt();
Print_Pattern(size, "A", 'B');
System.exit(0);
}
public static void Print_Pattern(int n, String pat,char alpha) { 
if(n==0)
    return;
System.out.println(pat);
pat=pat+alpha+(new StringBuilder(pat).reverse()).toString();
Print_Pattern(n-1,pat, (char) (alpha+1));
   }
  }
/* Example Input/Output 1:
Input: 3
Output:
A
ABA
ABACABA
Explanation:
Here N=3.
The 1st line contains the upper case alphabet A.
The 2nd line contains the upper case alphabets ABA (A + B + A)
The 3rd line contains the upper case alphabets ABACABA (ABA + C + ABA).
Hence the output is
A
ABA 
ABACABA*/
