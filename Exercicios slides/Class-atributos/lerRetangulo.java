import java.io.*;

class lerRetangulo {

	public static void main (String[] args) throws Exception {
		System.out.println ("Informe a quantidade de retangulos:");
	Retangulo retangulo1 [] = new Retangulo [JUtil.readInt()];
	
	for (int i=0;i < retangulo1.length;i++ )
	{
		retangulo1[i] = new Retangulo();
		System.out.println ("informe a base:");
		retangulo1[i].base = JUtil.readFloat();
		System.out.println ("informe o altura:");
		retangulo1[i].altura = JUtil.readFloat();
	}
	
	for (int i=0; i<retangulo1.length; i++ )
	{
		retangulo1[i].mostrarDados();
	}


}
}