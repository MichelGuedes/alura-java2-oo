import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaOrdenacaoConta {

	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaPoupanca c3 = new ContaPoupanca();
		ContaPoupanca c4 = new ContaPoupanca();
		
		c1.setNome("Lucas");
		c1.setNumero(3);
		
		c2.setNome("Tati");
		c2.setNumero(2);
		
		c3.setNome("Michel");
		c3.setNumero(1);
		
		c4.setNome("Mariana");
		c4.setNumero(4);
		
		c1.deposita(500);
		c2.deposita(1000);
		c3.deposita(250);
		c4.deposita(700);
		
		//List<ContaPoupanca> listaDeContas = new ArrayList<ContaPoupanca>();
		List<ContaPoupanca> listaDeContas = new LinkedList<ContaPoupanca>();
		
		listaDeContas.add(c1);
		listaDeContas.add(c2);
		listaDeContas.add(c3);
		listaDeContas.add(c4);

		Collections.sort(listaDeContas);
		
		//adiciona contas aleatorias
		for (int i = 0; i<=6; i++){
			ContaPoupanca c = new ContaPoupanca();
			Random r = new Random();
			
			c.setNumero(r.nextInt(200));
			c.deposita(r.nextDouble());
			c.setNome("Pleice Rouder da Silva");
			
			listaDeContas.add(c);
		}
		
		//imprime todas as contas adicionadas em listaDeContas
		for (ContaPoupanca c : listaDeContas){
			System.out.println("Conta de " + c.getNome() + ", numero " + c.getNumero() + ", " + c);
		}
		
	}

}
