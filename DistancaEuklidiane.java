public class DistancaEuklidiane
{ public static  double  norma( int n , double [] x,double[] y)
  { double norma1 ;
    double sum =0.0;
	 for(int i =0; i<=n; i++)
	 { sum = sum + Math.pow(y[i]-x[i],2);}
	  
	   norma1 = Math.pow(sum, 0.5);
		
		
		return norma1 ;}
		
		public static void main (String [] args)
		{ DistancaEuklidiane c = new DistancaEuklidiane();
		  double [] x = {2,1,3,-2,4};
        double [] y = {4,3,2,1,-2};
		  System.out.println(c.norma(4,x,y ));}
        
        }