
public class TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		
		c1.setNumero(1);
		c2.setNumero(1);
		
		if (c1.equals(c2)){
			System.out.println("Contas iguais!");
		}
		else {
			System.out.println("Contas diferentes!");
		}
		
		if (c1 == c2){
			System.out.println("Contas iguais!");
		}
		else{
			System.out.println("Contas diferentes!");
		}
	}

}
