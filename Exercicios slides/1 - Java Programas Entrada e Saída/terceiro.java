import java.io.*;
class terceiro{ //Calcule o salário líquido de um funcionário. Será informado seu nome, seu salário base e o desconto do INSS (11%, por exemplo). Cálculo : Liquido = Base – Base * Desconto / 100.
	static public void main (String[] args) throws Exception{
	String funcionario;
	float salarioBase, descontoInss;
	System.out.println("Informe o nome do funcionario: ");
	funcionario = JUtil.readString();
	System.out.println("informe o salario base do funcionario: ");
	salarioBase = JUtil.readFloat();
	System.out.println ("Informe o desconto do inss em %:");
	descontoInss = JUtil.readFloat();
	System.out.println("O salario final do funcionario é:" + (salarioBase*descontoInss)/100);
	JUtil.pause();
	}
}

