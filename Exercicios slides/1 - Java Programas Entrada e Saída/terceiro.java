import java.io.*;
class terceiro{ //Calcule o sal�rio l�quido de um funcion�rio. Ser� informado seu nome, seu sal�rio base e o desconto do INSS (11%, por exemplo). C�lculo : Liquido = Base � Base * Desconto / 100.
	static public void main (String[] args) throws Exception{
	String funcionario;
	float salarioBase, descontoInss;
	System.out.println("Informe o nome do funcionario: ");
	funcionario = JUtil.readString();
	System.out.println("informe o salario base do funcionario: ");
	salarioBase = JUtil.readFloat();
	System.out.println ("Informe o desconto do inss em %:");
	descontoInss = JUtil.readFloat();
	System.out.println("O salario final do funcionario �:" + (salarioBase*descontoInss)/100);
	JUtil.pause();
	}
}

