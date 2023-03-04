import java.util.*;

public class Printnumber {
    // print value from 1-10 in a loop 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int number = sc.nextInt();
         int counter=1;
         while(counter <= 10){
            System.out.println(counter);
            counter++;
         }
    }
}
