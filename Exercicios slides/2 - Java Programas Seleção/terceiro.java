import java.io.*;
/*
 Um n�mero ser� digitado. Voc� dever� informar se ele
� : Positivo, Negativo ou Nulo.
*/
class terceiro {
	static public void main (String[] args) throws Exception {
	int numero;
	System.out.println ("Digite um numero:");
	numero = JUtil.readInt();
	if(numero>0)
	{
	System.out.println ("numero positivo");
	}else if (numero == 0){
	System.out.println ("numero Nulo");
	}else
	System.out.println ("Numero Negativo");
	}
}