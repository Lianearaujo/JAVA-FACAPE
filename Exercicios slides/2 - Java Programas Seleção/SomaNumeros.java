class SomaNumeros{
    public static String soma (int num1){
       String temp2 = "";
       int somatotal=0, tempNumero =0;
	   tempNumero=num1;
        while (tempNumero%10 !=0) {
            somatotal = somatotal+tempNumero%10;
            tempNumero = tempNumero/10;
        }
        temp2 = ", Soma Total ="+ String.valueOf(somatotal);

        while (num1%10 !=0){
            if ((somatotal%(num1%10)) != 0){
                temp2 = num1%10 + temp2;
				
            }
			num1 = num1/10;
        }

        return temp2;
    }
    public static void main(String[] args)throws Exception {
        int num1=1;
        while (num1 !=0){
            System.out.println ("Informe o num1:");
            num1 = JUtil.readInt();
            System.out.println (soma(num1));
        }
    }
}