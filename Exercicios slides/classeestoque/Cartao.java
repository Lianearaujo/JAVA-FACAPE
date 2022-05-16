abstract class Cartao {
	private int numero;
	private String nome;
	private float limite;
	private float saldoDevedor;

	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public float getLimite(){
		return this.limite;
	}
	public void setLimite(float limite){
		this.limite = limite;
	}

	public float getSaldo(){
		return this.saldoDevedor;
	}




	public boolean autorizar (float valorCompra){
		return (valorCompra+this.saldoDevedor)<=this.limite;
	}

	public void comprar (float valorCompra) {
		if (autorizar (valorCompra))
		{
			this.saldoDevedor = this.saldoDevedor + valorCompra;
		}else{
			System.out.println ("Compra não autorizada!!!");
		}
	}

	public void pagar(float pagamento){
		 this.saldoDevedor = this.saldoDevedor - pagamento;
	}

	public void mostrarDados(){
		System.out.println ("Numero do Cartão:"+ this.numero +"\n Nome:"+ this.nome+"\n Limite do Cartão:"+ this.limite+
							"\n Saldo devedor:"+ this.saldoDevedor);
	}
}