import java.util.*;
public class BetweenPrime {
public static void main(String[] args) {
int n=new Scanner (System.in).nextInt();
for(int i=3;i<=n;i ++){
 if(isprime(i) && isprime(i+2)){
     System.out.print(i +1+" "); 
    }
   }
}
public static boolean  isprime(int n){
   int i=2;
    while(i*i<=n) {
      if(n%i==0)
         return false;
      i++;
 }
     return true;
 }
}
