
import java.util.*;
//print number from 1 to N
public class Solution {

     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number please:");
       int range = sc.nextInt();
       int counter =1;
       while(counter<=range){
        System.out.println(counter+ " ");
        counter++;
       }
       System.out.println();
     }
}