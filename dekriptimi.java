public class dekriptimi {
  
   
   
  	public static  void main(String[] args) {
		System.out.println("Per kushtin:");
  		char dekodimi[]=new char[26]; 
		
		for (int i=0; i<=25; i++){
			dekodimi[i]=(char)(33+i+' ');
			
		}
	 for (int i=0; i<=25; i++){
		 System.out.println(dekodimi[i]+" = "+i);
	 }
	{
	  char matrica2 [][]= {{'A','R','I'},
			             {'A','N','I'},
			             {'T','O','S'}};
	  
	 for (int i=0; i<=2; i++){
	      for (int j=0; j<=2; j++){
		       char k=matrica2[i][j];
		       int s=(int)k;
				  System.out.print((s-65)+"  ");

	      }
	  System.out.println();
	  }
	  
	 }
}}