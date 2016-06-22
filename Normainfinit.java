public class Normainfinit
   {
      public static void main(String[] args)  {
                
          int[][] matrica={{1,2,3},
               				{4,5,6,},
               			   {-10,-8,9}};
           max1(matrica);
                           
                           
                                     
}
      public static void max1(int[][] score) {
    for (int i = 0; i < score[0].length; i++) {
        int max = Math.abs(score[2][i]);
        for (int j = 0; j < score.length; j++){ 
            if (score[i][j] >  max){ 
                max = score[j][i]; 
            }
        }
        System.out.println(max + "      ");
    }
}
}