import java.util.*;
//package loops;
// Display all numbers entered by user except multiples of 10
public class Displaynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{ 
            System.out.println("enter your number:");
            int n = sc.nextInt();
            System.err.println(n);
            if(n%10 ==0){
                break;
            }
        }while(true);
        // do{
        //      System.out.println("enter yur number");
        //      int n = sc.nextInt();

        //      if(n % 10 ==0){
        //         continue;
        //      }
        //      System.out.println("number was:"+ n);
        // }while(true);
    }
}
