public class zerotraingle {
    public static void zeroonetraingle(int n){
        //outer 
        for(int i =1; i<= n; i++){
            for(int j =1; j<= i; j++){
                if((i+j) % 2 ==0){//even
               System.out.print("1");
                }else{
                    System.err.print("0");
                }
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        zeroonetraingle(5);
    }
}
