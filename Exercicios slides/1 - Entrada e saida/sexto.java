import java.io.*;
/* Fa�a um programa que leia o nome, o peso e a
altura. Calcule o peso ideal para homem e para
mulher, conforme a f�rmula abaixo:
� Homem : (72.7 * altura ) - 58.00
� Mulher : (62.10 * altura ) - 44.70
*/
class sexto {
	public static void main (String[] args) throws Exception {
	String nome;   //String na hora de declarar diferentes das outras tem que ter o S maiusculo
	float peso, altura;
	System.out.println ("Informe o nome e altura:" );
	nome= JUtil.readString();
	altura = JUtil.readFloat();
	System.out.println ("Nome:"+ nome +"\nO peso ideal caso homem �: "+ ((72.7*altura)-58) +"\nCaso Mulher o � de:"+ ((62*altura)-44.7));
	}
}