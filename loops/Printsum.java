//package loops;
import java.util.*;
public class Printsum {
    // sum of natual numbers 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number you want to sum ");
        int n = sc.nextInt();
        int sum =0;
        int i = 1;
        while(i<=n){
            sum = sum+i; // sum+=i;
            i++;
        }
        System.out.println("the sum of natural numbers:" +sum);
    }
}
