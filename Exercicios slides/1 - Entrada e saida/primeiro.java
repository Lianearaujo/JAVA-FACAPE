import java.io.*;
class primeiro  //Leia um n�mero inteiro e outro float e calcular a m�dia aritm�tica. Utilize a classe JUtil. 
{
	public static void main(String[] args) throws Exception
	{
		int x;
		float y;
		System.out.println("informe um numero:");
		x = JUtil.readInt();
		System.out.println ("informe outro numero:");
		y = JUtil.readFloat();
			System.out.println("A media aritim�tica �: "+ (x+y)/2);
		JUtil.pause();

	}
}
