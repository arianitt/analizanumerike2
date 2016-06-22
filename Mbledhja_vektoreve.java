
  public class Mbledhja_vektoreve{
 
  public static void main(String[] a){
		 

        int n=4;
        int vektori[]= new int[n];
        vektori[0]=1;
        vektori[1]=2;
        vektori[2]=3;
        vektori[3]=4;

for (int i=0; i<n; i++){
System.out.print(vektori[i]+" ");}
System.out.println();
System.out.println("+");
int vektori2[]= new int[n];
vektori2[0]=2;
vektori2[1]=3;
vektori2[2]=4;
vektori2[3]=5;
for( int i=0; i<n; i++)
{System.out.print(vektori2[i]+" ");}
    
System.out.println();
System.out.println("=");

int mbledh []=new int [n];
for  (int i=0; i<n; i++){
	mbledh[i]=vektori[i]+vektori2[i];
	System.out.print(mbledh[i]+" ");
   }
 }
}

