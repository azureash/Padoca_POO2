import java.util.Scanner;

public class Dados {

	private int id_prod;
	private int qtd_prod;
	private String nome_prod;
	
	Scanner sc = new Scanner(System.in);
		
	public int getId_prod() {

		System.out.println("ID do produto: ");
		id_prod = sc.nextInt();
		
		return id_prod;
	}
	
	public int getQtd_prod() {
		
		System.out.println("Quantidade do produto: ");
		qtd_prod = sc.nextInt();
		
		return qtd_prod;
	}
	
	public String getNome_prod() {
		
		System.out.println("Nome do produto: ");
		nome_prod = sc.next();
				
		return nome_prod;
	}
	
}
