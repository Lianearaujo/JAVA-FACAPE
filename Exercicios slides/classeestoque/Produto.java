abstract class Produto{
    private int codigo;
    private String nome;
    private int quantidade;
    private float custo;

	public Produto (int codigo, String nome, int quantidade, float custo){
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.custo = custo;
	}

	public int getCodigo (){
		return this.codigo;
	}

	public void setCodigo (int codigo){
		this.codigo = codigo;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String n){
		this.nome = n;
	}

	public float getCusto(){
		return this.custo;
	}

	public void setCusto(float c){
		this.custo = c;
	}

	public int getQuantidade (){
		return this.quantidade;
	}

    public float getValorEstoque(){
        return (this.quantidade * this.custo);
    }

    public void repor (int quantidade, float custo){
        this.quantidade = this.quantidade + quantidade;

    }

    public boolean validarSaldo (int x) {
        return (this.quantidade >= x);

    }
    public void baixar (int x){
        if (this.validarSaldo(x)){
            this.quantidade = this.quantidade - x;
        } else {
            System.out.println ("Não foi possivel validar saldo");
        }
    }

    public void MostrarDados(){
        System.out.println ("Codigo:"+ this.codigo +"\n Nome:"+ this.nome+"\n Quantidade:" +
                            this.quantidade +"\n Custo:"+ this.custo +"\n Valor Do Estoque:"
                            + this.getValorEstoque());

    }
}