/* Um motorista anota a marca��o do od�metro do seu
ve�culo antes (Km1) e ap�s uma viagem (Km2), bem
como o n�mero de litros (litros) de combust�vel gastos.
Fa�a um programa em Java que leia os 3 dados acima, o
pre�o do litro de combust�vel (preco), a capacidade do
tanque (capacidade) e mostre:
� a) Quilometragem rodada (Km2- Km1).
� b) Consumo : quantos quil�metros por litro faz o
ve�culo (Quilometragem/litros).
� c) Autonomia do ve�culo (Consumo * capacidade).
� d) Custo da viagem (litros * preco). */
import java.io.*;
class quarto { 

	public static void main(String[] args) throws Exception{
	float km1, km2, litros, preco, capacidade;
	System.out.println ("informe o od�mentro inicial: ");
	km1 = JUtil.readFloat();
	System.out.println ("informe o od�mentro final: ");
	km2 = JUtil.readFloat();
	System.out.println ("informe quantos litros de gasolina foi gasto: ");
	litros = JUtil.readFloat();
	System.out.println ("informe o pre�o da gasolina: ");
	preco = JUtil.readFloat();
	System.out.println ("informe a capacidade do tanque: ");
	capacidade = JUtil.readFloat();
	System.out.println (" A Quilometragem rodada �: "+ (km2-km1) +"\n O consumo do carro �: " + ((km2-km1)/litros) +"\n A autonomia do carro � de: "+ 
	(((km2-km1)/litros)*capacidade) +"\n O custo da viajem foi de: "+ (litros*preco));

	
	}
}