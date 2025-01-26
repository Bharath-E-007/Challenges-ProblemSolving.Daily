import java.util.*;

public class togglechar {
   public static void main(String[] args) {

Scanner sc=new Scanner (System.in);
 int n=sc.nextInt();
 char ch[][]=new char [n][n];
 boolean b[][]=new boolean [n] [n];
 for(int i = 0 ;i<n;i++)

for(int j = 0 ;j<n;j++)

ch[i][j]=sc.next().charAt(0);

 int q=sc.nextInt();
for(int i = 0 ;i<q;i++) {

int s=sc.nextInt()-1 ,e=sc.nextInt();

int 1 = s;
 while(s<e) {

 for(int j = 0 ;j<n;j++)

 b[s][j]^=true;

 s++;

 }

 while(s1<e) {
 for(int j = 0 ;j<n;j++)
 b[j][s1]^=true;

 s1++;

 }

 }
for(int i=0;i<n;i++){

 for(int j = 0 ;j<n;j++)

System.out.print (b[i][j] ?ch[i][j]:'*'+" ");

 System.out.println ();

 }

 System.exit(0);
   }
}
/* Toggle the char and '*' based on the query range */
