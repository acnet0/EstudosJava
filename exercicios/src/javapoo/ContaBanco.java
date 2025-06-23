package javapoo;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private Double saldo;
	private boolean status;
	
	public ContaBanco () {
		this.saldo = 0.0;
		this.status = false;
	}
	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("----------------------------");
	}
	public void abrirConta(String t) {
		setTipo(t);
			if (!(t == "CC" || t == "CP")) {
				System.out.println("Insira um tipo valido de conta CC: Corrente / CP: Poupanca");
			} else {
			if (t=="CC") {
				setSaldo(50.0);
				setStatus(true);
			} else if (t == "CP") {
				setSaldo(150.0);
				setStatus(true);
			}
			System.out.println("Conta aberta com sucesso." + getDono());
		}	
	}
	public void fecharConta() {
		if (this.saldo == 0) {
			status = false;
			System.out.println("Seu saldo era de:" + saldo + "Sua conta foi encerrada");
		}
		if (this.saldo > 0) {
			System.out.println("Para fechar sua conta é necessário que saque seu saldo em conta de: + saldo");	
		}
		if (this.saldo < 0) {
			System.out.println("Para fechar sua conta é necessário pagar seu débito em conta de: " + saldo);
		}
	}
	public void depositar(Double deposito) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("O deposito de " + deposito + " foi efetuado com sucesso. Na conta de: " + this.getDono() + " Saldo: " + saldo);
		} else {
			System.out.println("Para depositar primeiro precisa ter uma conta válida");
		}
	}
	public void sacar(Double saque) {
		if (this.status == true) {
			if (saque <= saldo) {
				this.saldo = saldo - saque;
				System.out.println("O saque de " + saque + " foi efetuado com sucesso, restando o saldo de: " + saldo);
			} else {
				System.out.println("ERRO: valor excede o que contem na conta");
			}
		}
	}
	public void pagarMensal() {
		double v = 0.0;
		if (this.getTipo() == "CC") {
			v = 12.0;
		} else if (this.getTipo() == "CP") {
			v = 20.0;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	public void setNumConta (int c) {
		this.numConta = c;
	}
	public int getNumConta () {
		return this.numConta;
	}
	public void setTipo (String t) {
		this.tipo = t;
	}
	public String getTipo () {
		return this.tipo;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(Double sld) {
		this.saldo = sld;
	}
	public Double getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean sts) {
		this.status = sts;
	}
	public boolean getStatus () {
		return this.status;
	}
	
}
