
import java.util.Scanner;

public class vowelschange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] str1=sc.nextLine().toCharArray();
        char[] str2=sc.nextLine().toCharArray();
        int ind1=-1,ind2=-1;
        int i=0,j=0;
        while(i<str1.length || j<str2.length){
            if(i<str1.length && ind1==-1){
                if(vowels(str1[i]))
                  ind1=i;
                i++;
            }
            if(j<str2.length && ind2==-1){
                if(vowels(str2[i]))
                  ind2=j;
                j++;
            }
            if(ind1!=-1 && ind2!=-1){
                char temp=str1[ind1];
                str1[ind1]=str2[ind2];
                str2[ind2]=temp;
                ind1=-1;ind2=-1;
            }
        }
        System.out.println(new String(str1)+" "+new String(str2));
    }
    public static boolean vowels(char c){
        return "aeiou".indexOf(Character.toLowerCase(c))!=-1;
    }
}
/*
Example Input/Output 1:

Input: apple rain

Output: appli raen

Explanation:
Here S1 apple and S2 = rain. After
 interchanging the vowels in the string 
 values in their order of occurrence, the string values become
  S1=appli and S2 = raen. 
 */
