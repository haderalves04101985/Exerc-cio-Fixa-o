public class FuncionarioV3 {
    String nome;
    String departamento;
    double salario;
    Data data_ent;
    String rg;
    boolean ativo;
    
    void mostrar()
    {
    
    System.out.println(nome);
    System.out.println(departamento);
    System.out.println(salario);    
    System.out.println(data_ent.dia+"-"+data_ent.mes+"-"+data_ent.ano);
    System.out.println(rg);
    System.out.println(ativo);
    
    }
}
