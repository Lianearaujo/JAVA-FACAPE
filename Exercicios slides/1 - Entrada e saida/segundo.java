import java.io.*;
class segundo {//Calcule o lucro de um a empresa (receita menos despesa) e informe o resultado. Obs : Os valores em Real.

	public static void main (String[] args) throws Exception
	{
	Float x,y;
	System.out.println("informe a receita da empresa em R$: ");
	x = JUtil.readFloat();
	System.out.println("informe a despesa da empresa em R$: ");
	y = JUtil.readFloat();
	System.out.println("A receita da empresa é R$: "+ (x-y));
	JUtil.pause();
	
	}
}