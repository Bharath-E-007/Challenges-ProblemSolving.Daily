/* The program must accept two string values s1 and s2 of 
   equal length as the input. The program must print the 
   characters in $1 where the characters in the same position in $2 are in upper case.
   Similarly, the program must print the characters in $2 where the characters in 
   the same position in $1 are upper case.

   Boundary Condition(s):
   1<= Length of S1, S2 <= 1000
 */
import java.util.*;
public class Hello {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String str1=sc.nextLine(),str2=sc.nextLine();
  PrintString(str1,str2);
  PrintString(str2, str1);
   System.exit(0);
}
public static void PrintString(String s1, String s2){

for(int i=0;i<s2.length();i++){
   char c=s2.charAt(i);
   if(c>='A' && c<='z')
      System.out.print(s1.charAt(i));
}
  return;
   }
}
/*Example Input/Output 1:

Input:
Skill Rack
EduCaTION
Output:
SIRackET
Explanation:
Here S1 Skill Rack and S2 EduCaTION.
In S2, the upper case alphabets are present in the positions 1, 4, 6, 7, 8 and 9.
So the characters present in these 6 positions in S1 are printed.
SIRack
In S1, the upper case alphabets are present in the positions 1 and 6.
So the characters present in these 2 positions in S2 are printed.
ET
Hence the output is
SIRackET

 */
