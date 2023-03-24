import java.util.*;
//package loops;

public class Reversenumber {
    public static void main(String[] args) {
        // kisi bhi number ko 10 se remainder krdu toh uska last number ajata hai || lastdigit = num%10
        // similaryly agar last digit ko hatana ho toh didvde krdo use 10 se|| lastdigithatana = num/10
        int n = 1089989;
        System.out.println(n);
        while(n>0){
            int lastDigit =n%10;
            System.out.print(lastDigit);
            n= n/10;// n/=10
        }
        System.out.println();
       }
}
