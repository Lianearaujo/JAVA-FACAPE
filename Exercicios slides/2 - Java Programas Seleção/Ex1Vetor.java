
/*1) Pedir N nomes e idades.
– a) Pedir assim: “Qual a 1º nome ?”
– b) Mostrar quais os nomes e idades informados
– c) Somar as idades
– d) Média das idades
– e) Maior e menor idade
– f) Mostrar em ordem decrescente !
– g) Entre 10 e 40 anos
– h) Pedir um número e mostrar o nome
– i) Pedir um nome e mostrar o número */
class Ex1Vetor 
{
	public static void main(String[] args) throws Exception 
	{
		int x, somaidades=0, maior=0, menor=0, y, i, temp =0;
		float mediaidades;
		String n;
		System.out.println ("Informe a quantidade de nomes e idades:");
		PessoaEx1Vetor p []= new PessoaEx1Vetor [JUtil.readInt()];
		int tempidade[] = new int [p.length];
		System.out.println ("Quantidade de nomes:" + p.length + "\n Quantidade de Idades:"+ p.length);
		x =0;
		while (x<p.length){
			p[x] = new PessoaEx1Vetor(); 
			System.out.println ("Qual a "+ (x+1) +"º nome ?");
			p[x].Nome = JUtil.readString();
			System.out.println ("Qual a "+ (x+1) +"º idade ?");
			p[x].Idade = JUtil.readInt();
			System.out.println ("Nombes e idades Informados:");
			x = x+1;
		}
		for (i = 0; i<(int)p.length ; i++)
		{
			System.out.println ("Nome:"+ p[i].Nome + " - Idade:"+ p[i].Idade);
			somaidades = somaidades+ p[i].Idade;
			if (maior == 0)
			{
				maior = p[i].Idade;
			} else if (p[i].Idade > maior)
			{
				maior = p[i].Idade;
			}
			if (menor == 0)
			{
				menor = p[i].Idade;
			} else if (p[i].Idade < menor)
			{
				menor = p[i].Idade;
			}
		}
		mediaidades = (somaidades/p.length);
		System.out.println ("Soma Idades:"+ somaidades +"\n Media Idades:"+ mediaidades +"\n Maior Idade:"+
			maior +"\n Menor Idade"+ menor);
		System.out.println ("Ordem decrescente da idades:");
		tempidade[0] = maior;
		for (i =0; i< p.length ; i++ )
		{
			if (i !=0)
			{
				for (y=0; y<p.length ; y++ )
				{
					if (p[y].Idade != maior && p[y].Idade < maior)
					{
						if (p[y].Idade > temp)
						{
							tempidade[i] = p[y].Idade;
							temp = p[y].Idade;
						}
					}
				}
				maior = temp;
				temp=0;
			}
							
		}
		for (i=0; i<tempidade.length ;i++ )
		{
			if (i == (tempidade.length-1))
			{
				System.out.println (tempidade[i]);
			}else
			{
				System.out.print (tempidade[i] +",");
			}
		}
		System.out.println ("Pessoas entre 20 a 40 anos:");
		for (i=0; i<p.length ; i++ )
		{
			if (p[i].Idade >= 20 && p[i].Idade <= 40)
			{
				if (i == (p.length-1))
				{
					System.out.println (p[i].Nome +" = "+ p[i].Idade);
				} else
				{
					System.out.print (p[i].Nome +" = "+p[i].Idade+",");
				}
			}
		}
		temp = 1;
		while (temp!=0)
		{
			System.out.println ("Informe o nome da pessoa que deseja saber a idade:");
			n = JUtil.readString();
			for (i=0; i<p.length; i++)
			{
				if (p[i].Nome.equals(n)){
					System.out.println ("A idade é:"+ p[i].Idade);
				}
			}
			System.out.println ("Digite a idade, para saber as pessoas com ela");
			temp = JUtil.readInt();
			for (i=0; i<p.length; i++)
			{
				if (p[i].Idade == temp){
					System.out.println ("Nome:"+ p[i].Idade +" tem a idade informada");
				}
			}
			System.out.println ("Deseja finalizar consulta ? para sim digite 0");
			temp = JUtil.readInt();
		}






	}
}
