class LerFuncionario{

    public static void main (String[] args) throws Exception{
        FuncionarioMatricula F = new FuncionarioMatricula();
        System.out.println ("Informe a matricula:" );
        F.matricula = JUtil.readInt();
        System.out.println ("Informe a nome:" );
        F.nome = JUtil.readString();
        System.out.println ("Informe valor hora:" );
        F.hora = JUtil.readFloat();
        System.out.println ("Informe total de horas trabalhadas:" );
        F.valor = JUtil.readFloat();
        F.mostrarDados();
    }

}