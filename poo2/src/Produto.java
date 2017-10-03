import java.util.Scanner;

public class Produto implements Lisere {

	Dados D = new Dados();
	int x =0;
	Scanner sc = new Scanner(System.in);
	int[] IdP = new int[x];
	int[] QtdP = new int[x];
	String[] StrP = new String[x];
	
	
	@Override
	public void insere() {
		
		int i=-1;
		
		while(i != 0) {
			
			IdP[x] = D.getId_prod();
			QtdP[x] = D.getQtd_prod();
			StrP[x] = D.getNome_prod();
			x++;
			
			System.out.println("Add novo produto? 1-S 0-N ");
			i = sc.nextInt();
		}
		
	}

	@Override
	public void imprime() {
	
		for (int j = 0; j < P.length; j++){
			   System.out.print(P.length + " ");
			   if (j % 3 == 2) {
			       System.out.print("\n");
			   }
			}
		
	}
	

}
