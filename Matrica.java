   public class Matrica
   {
      public static void main(String[] args)  {
         double matrica[][]= {{1,3,5,0},
               				{-5,1,6,3},
               				{5,9,6,0},
               				{2,4,9,1}};
      							
         double matrica1[][]= {{1,2},
			                   {3,4},
									 {2,3},
									 {1,5}} ;
      afishoMatricen(matrica); 
           }
      
      public static double[][] njesi(int N) {
         double [][] iden= new double[N][N] ;
         for (int i = 0; i < N; i++)
            iden[i][i] = 1;
         return iden;
      }
      
      private static double[][] ndrro(int i, int j, double matrica[][]) {
         double[] temp = matrica[i];
         matrica[i] = matrica[j];
         matrica[j] = temp;
         return matrica;
      }
   
	  private static double[][] transpono(double varg[][]) {
         double matrica[][]=varg;
			double trans[][]=new double[matrica[0].length][matrica.length] ;
         for (int i = 0; i < matrica[0].length; i++)
            for (int j = 0; j < matrica.length; j++)
               trans[i][j] = matrica[j][i];
         return trans;
      }
   	  
       	
      private static double[][] mbledh(double[][] a,double[][] b) {
         if (a.length != b[0].length|| a[0].length!= b[0].length) throw new RuntimeException("gabim ne dimenzione !");
         double[][] c = new double[a.length][a[0].length];
         for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
               c[i][j] = a[i][j] + b[i][j];
         return c;
      }
   
      private static double[][] zbrit(double[][] a,double[][] b) {
         if (a.length != b[0].length||a[0].length!= b[0].length) throw new RuntimeException("gabim ne dimenzione !");
         double[][] c = new double[a.length][a[0].length];
         for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
               c[i][j] = a[i][j] - b[i][j];
         return c;
      }
   
      public boolean eq(double[][] a,double[][] b) {
       
         if (a.length != b[0].length||a[0].length!= b[0].length) throw new RuntimeException("gabim ne dimenzione !");
         for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
               if (a[i][j] != b[i][j]) 
                  return false;
         return true;
      }
   
      private static double[][] shumezo(double[][] a,double[][] b) {
      
         if (a[0].length != b.length) throw new RuntimeException("gabim ne dimenzione !");
         double[][] c = new double[a.length][b[0].length];
      
         for (int i = 0; i <c.length; i++)
            for (int j = 0; j < c[0].length; j++)
               for (int k = 0; k < a.length; k++)
                  c[i][j] += (a[i][k] * b[k][j]);
         return c;
      }
   
      public static void afishoMatricen(double[][] vargu) 
      {
       
         for(int i = 0; i <vargu.length; i++) 
         {
            System.out.print("[");
            for(int j = 0; j <vargu[0].length; j++) 
            {
               System.out.print(" " + vargu[i][j]);
            }
            System.out.println(" ]");
         }
         System.out.println();
      }
   }