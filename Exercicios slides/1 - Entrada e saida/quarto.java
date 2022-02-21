/* Um motorista anota a marcação do odômetro do seu
veículo antes (Km1) e após uma viagem (Km2), bem
como o número de litros (litros) de combustível gastos.
Faça um programa em Java que leia os 3 dados acima, o
preço do litro de combustível (preco), a capacidade do
tanque (capacidade) e mostre:
– a) Quilometragem rodada (Km2- Km1).
– b) Consumo : quantos quilômetros por litro faz o
veículo (Quilometragem/litros).
– c) Autonomia do veículo (Consumo * capacidade).
– d) Custo da viagem (litros * preco). */
import java.io.*;
class quarto { 

	public static void main(String[] args) throws Exception{
	float km1, km2, litros, preco, capacidade;
	System.out.println ("informe o odômentro inicial: ");
	km1 = JUtil.readFloat();
	System.out.println ("informe o odômentro final: ");
	km2 = JUtil.readFloat();
	System.out.println ("informe quantos litros de gasolina foi gasto: ");
	litros = JUtil.readFloat();
	System.out.println ("informe o preço da gasolina: ");
	preco = JUtil.readFloat();
	System.out.println ("informe a capacidade do tanque: ");
	capacidade = JUtil.readFloat();
	System.out.println (" A Quilometragem rodada é: "+ (km2-km1) +"\n O consumo do carro é: " + ((km2-km1)/litros) +"\n A autonomia do carro é de: "+ 
	(((km2-km1)/litros)*capacidade) +"\n O custo da viajem foi de: "+ (litros*preco));

	
	}
}