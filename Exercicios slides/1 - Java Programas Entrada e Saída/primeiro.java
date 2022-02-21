import java.io.*;
class primeiro  //Leia um número inteiro e outro float e calcular a média aritmética. Utilize a classe JUtil. 
{
	public static void main(String[] args) throws Exception
	{
		int x;
		float y;
		System.out.println("informe um numero:");
		x = JUtil.readInt();
		System.out.println ("informe outro numero:");
		y = JUtil.readFloat();
			System.out.println("A media aritimética é: "+ (x+y)/2);
		JUtil.pause();

	}
}
