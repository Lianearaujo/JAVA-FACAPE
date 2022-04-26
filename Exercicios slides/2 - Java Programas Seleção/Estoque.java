/*4) Sistema de Estoque.
■ Um produto contém código, nome,
quantidade, unidade, valor unitário e valor
total.
■ Um cliente deseja cadastrar
■ seus produtos e mostrar no final :
■ * O produto mais caro
■ * O produto mais barato */
class Estoque {


    public static void main (String[]args) throws Exception
    {
        int maior =0, menor =0;
        System.out.println ("Informe a quantidade de produtos que deseja cadastrar:");
        SistemaEstoque s[] = new SistemaEstoque[JUtil.readInt()];

        for (int i = 0; i < s.length; i++)
        {

            s[i]= new SistemaEstoque();
            s[i].codigo = i+1;
            System.out.println ("Informe o nome do produto " + s[i].codigo +":");
            s[i].nome = JUtil.readString();
            System.out.println ("Informe as unidades do produto:" + s[i].nome);
            s[i].unidade = JUtil.readInt();
            System.out.println ("Informe o valor unitario do produto:" + s[i].nome);
            s[i].VUnitario = JUtil.readInt();
            s[i].valortotal = (s[i].unidade*s[i].VUnitario);

            if (i==0){
                maior = s[i].codigo;
                menor = s[i].codigo;
            }else if (maior < s[i].VUnitario){
                maior = s[i].codigo;
            }else if (menor > s[i].VUnitario){
                menor = s[i].codigo;
            }
        }


    }


}