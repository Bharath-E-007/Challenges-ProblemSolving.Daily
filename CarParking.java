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