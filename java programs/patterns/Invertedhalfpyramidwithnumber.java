public class Invertedhalfpyramidwithnumber {

  public static void Inverted_half_pyramid_with_numbers(int n){
    //outer loop
    for(int i =1; i<= n; i++){
        // inner loop
        for( int j=1; j<=n-i+1;j++){
           System.err.print(j+ " ");
        }
        System.out.println();
    }
  }
      public static void main(String[] args) {
        Inverted_half_pyramid_with_numbers(5);
    }
}
