public class Hollowrectangle {
    public static void hollow_rectangle(int totalrow, int totalcol){
        //outer lopps
        for(int i =1; i<= totalrow; i++){
           // inner loop
           for(int j =1 ; j<= totalcol; j++){
            //cell (i,j)
            if(i == 1 || i == totalrow || j == 1 || j == totalcol){
                // boundary cells
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(10, 7);
    }
}
