import java.io.*;
class numeros {
	public static void main (String[]args) throws Exception {
	int linhas, cont;
	String conf = "y";
	System.out.println ("Informe quantos numeros deseja aparecer:");
	linhas = JUtil.readInt();
	cont = 1;
	while (cont <=linhas && conf.equals("y")){
		if ((cont%5) == 0 || cont == linhas){
			System.out.println(cont);
		} else
		{
			System.out.print(cont +",");
		}
		if (cont%10 == 0)
		{
			System.out.println ("Deseja aparecer mais linhas? y/n");
			conf = JUtil.readString();
		}
		cont ++;
	}
	JUtil.pause();
	
	
	}
}