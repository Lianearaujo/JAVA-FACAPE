/*Uma empresa está contratando novos funcionários.
Peça o nome do candidato e sua idade. Para ser
aprovado deve ter idade entre 25 e 30 anos (homens) e
entre 18 e 25 (mulheres). */

import java.io.*;
class quinto{
	public static void main (String[] args) throws Exception {
	String Nome, Genero;
	int Idade;


	System.out.println ("Informe nome do candidato");
	Nome = JUtil.readString();
	System.out.println ("Informe a idade");
	Idade = JUtil.readInt();
	System.out.println ("Informe o genero(M para masculino/ F para feminino)");
	Genero = JUtil.readString();
	if (Genero == "M") //verifica primeiro o genero para depois da idade para verificar se vai ser aprovado
	{
		if ((Idade>= 25) && (Idade <=30))
		{
			System.out.println ("Aprovado");
		}else
		System.out.println ("Reprovado");
	}else if (Genero == "F")
	{
		if ((Idade>= 18) && (Idade <= 25)) 
		{
			System.out.println ("Aprovado");	
		}else
		System.out.println ("Reprovado");
	}


	}
}
