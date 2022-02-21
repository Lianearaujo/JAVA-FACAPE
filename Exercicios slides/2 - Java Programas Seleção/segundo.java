import java.io.*;
/*Calcule o lucro para a empresa ABC, mostrando se
houve lucro, prejuízo.*/
class segundo{
	public static void main (String[] args) throws Exception{
	float prejuizo, lucro;
	System.out.println("Informe lucro e prejuizo");
	lucro = JUtil.readFloat();
	prejuizo = JUtil.readFloat();
	if (lucro>prejuizo)
	{
	System.out.println ("Empresa com lucro");
	}else
	{
	System.out.println ("Empresa com prejuizo");
	}
	}


}