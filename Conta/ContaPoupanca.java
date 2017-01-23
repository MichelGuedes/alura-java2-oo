public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	public void atualiza(double taxa) {
		this.setSaldo(this.getSaldo() + this.getSaldo() * (taxa * 3));
	}

	public void deposita(double valor) {
		double taxaParaDeposito = 0.10;
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + (valor - taxaParaDeposito));
		}
	}

	//@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNumero() - o.getNumero();
	}
}