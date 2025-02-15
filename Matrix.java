import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt(),c =sc.nextInt();
        String str[][]=new String[r] [c];
       for(int i=0;i<r;i++) {
         for(int j=0;j<c;j++)
        str[i][j]=sc.next(); 
   }
 int sum=0;
 StringBuilder sb=new StringBuilder();

 for(int i=0;i<c;i++){

 for(int j=0;j<r;j++){

 if(!Character.isDigit(str[i][j].charAt(0)))
      sb.append(str[j][i]);
    else
        sum+=Integer.parseInt(str[j][i]);
 }
}
 System.out.println(sb +" "+sum);
 System.exit(0);
 }

 }
   
