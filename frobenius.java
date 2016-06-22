public class frobenius{
public static void main(String[] a){
int b[][]={{1,2},{3,2}};

double shuma =0;
for (int i=0; i<2;i++){
   for (int j =0; j<2; j++){
        shuma =shuma+ Math.pow(Math.abs(b[i][j]),2);
   
   
   }


}
System.out.println(Math.sqrt(shuma));



}


}