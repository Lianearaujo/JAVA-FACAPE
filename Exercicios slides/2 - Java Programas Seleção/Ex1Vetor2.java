class Ex1Vetor2 
{
	public static void main(String[] args) throws Exception 
	{
		int x;
			//, somaidades=0, maior=0, menor=0, y, i, temp =0;
		//float mediaidades;
		//String n;
		//System.out.println ("Informe a quantidade de nomes e idades:");
		PessoaEx1Vetor p []= new PessoaEx1Vetor [JUtil.readInt()];
		//int tempidade[] = new int [p.length];
		//System.out.println ("Quantidade de nomes:" + p.length + "\n Quantidade de Idades:"+ p.length);
		x =0;
		while (x<p.length){
			System.out.println ("Qual a "+ (x+1) +"� nome ?");
			p[x].Nome = JUtil.readString();
			System.out.println ("Qual a "+ (x+1) +"� idade ?");
			p[x].Idade = JUtil.readInt();
			System.out.println ("Nomes e idades Informados:");
		x = x+1;
		}
	}
}
