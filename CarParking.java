import java.util.*;
public class CarParking {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int row=sc.nextInt(),col=sc.nextInt();
   sc.nextLine();
   int count=0;
   for(int i=0;i<row;i++){
      String str[]=sc.nextLine().split(" ");
     for(int j=0;j<col-1;j++)
        if(check(str[j], "V") && check(str[j+1],"."))
           count++;
   if(check(str[str.length-1],"."))
       count++;
}
  System.out.println(count);
  System.exit(0);
}
public static boolean check(String s1, String s2){
    return s1.equals(s2);
}
}
/*There are several vehicles parked in a matrix format. 
But the vehicles can be of varying size (length).
A parked vehicle is represented by one or more V along a given row.
An empty parking slot is represented using a dot(.)
The program must accept the matrix representing the R*C parking slots and print the number of vehicles N.

Boundary Condition(s):
1 <= R, C <= 100

Input Format:
The first line contains R and C separated by a space.
The next R lines contain the parking slots status.

Output Format:
The first line contains N.

Example Input/Output 1:
Input:

3 5
V V . V .
. .  . V .
. V V V V
Output:
4

Explanation:
In the first row, there are 2 vehicles parked.
In the second row, there is one vehicle parked.
In the third row, there is one vehicle parked.
So totally there are 4 vehicles. */