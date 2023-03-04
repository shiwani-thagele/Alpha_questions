public class Solidrombus {
    public static void solid_rombus(int n ){
       //outer loop
        for(int i =1; i<= n; i++){
       // inner loop
        for(int  j=1; j<=(n-i); j++){
         System.out.print( " ");
        }
     //starts
        for(int j =1; j<=n; j++){
    System.out.print("*");
}
        System.out.println();
        }
    }
    
    public static void main(String[] args) {
        solid_rombus(15);
    }
}
