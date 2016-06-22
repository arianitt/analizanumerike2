import java.util.Arrays;

public class DistancaMaksimale {

  public static void main(String[] args) {
    int n=5;
    int a[] = {1,2,3,4,5};
    int b[] = {2,3,4,-1,20};
    
    
    int c[]=new int[n];
    
    for (int i =0; i<n;i++){
        c[i]=Math.abs(a[i]-b[i]);
    }
    
    
    
    
   Arrays.sort(c);
   
    int max= c[c.length-1];
    System.out.println(max);

  }

}
