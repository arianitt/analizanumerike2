public class NormaEuk
{ public static  double  normaa( int n , double [] x)
  { double norma ;
    double sum =0.0;
	 for(int i =0; i<=n; i++)
	 { sum = sum + Math.pow(x[i],2);}
	  
	   norma = Math.pow(sum, 0.5);
		
		
		return norma ;}
		
		public static void main (String [] args)
		{ NormaEuk l = new NormaEuk();
		  double [] x = { 1,2,3,-2,4};
		  System.out.println(l.normaa(4,x ));}}