public class Shuma_Matricave
{
    public static void main(String[] argv)
    {
                        
          int Matrica1[][]={{1,2,3},
                            {4,5,6},
                            {7,8,9}}; 
          int Matrica2[][]={{9,8,7},
                            {6,5,4},
                            {-1,3,-4}};
                            
          int Shuma[][]    = new int[3][3];                  
                                 

        System.out.println("Matrica1");

                for(int i = 0; i < Matrica1.length; i++)
        {
            for(int j = 0; j < Matrica1[i].length; j++)
            {
                                System.out.print(Matrica1[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Matrica2");

                for(int i = 0; i < Matrica2.length; i++)
        {
            for(int j = 0; j < Matrica2[i].length; j++)
            {
               
                System.out.print(Matrica2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Shuma");

                for(int i = 0; i < Shuma.length; i++)
        {
            for(int j = 0; j < Shuma[i].length; j++)
            {
               
               Shuma[i][j] = Matrica1[i][j] +
                                        Matrica2[i][j];

                System.out.print(Shuma[i][j] + "  ");
            }
            System.out.println();
        }
    }
}