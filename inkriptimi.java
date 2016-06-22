public class inkriptimi {
  
   
   
  	public static void main(String[] args) {
		System.out.println("Per kushtin:");
  		char kodimi[]=new char[26]; 
		
		for (int i=0; i<=25; i++){
			kodimi[i]=(char)(33+i+' ');
			
		}
	 for (int i=0; i<=25; i++){
		 System.out.println(kodimi[i]+" = "+i);
	 }
	{
	  int matrica [][]= {{0,17,8},
			             {0,13,8},
			             {19,14,18}};
	  int p=0;
	  for (int i=0; i<=2; i++){
	      for (int j=0; j<=2; j++){
		       p=matrica[i][j];
		       System.out.print(kodimi[p]+"  ");
	      }
	  System.out.println();
	  }
	  
	}
 }
}   