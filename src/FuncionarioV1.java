public class FuncionarioV1 {
    String nome;
    String departamento;
    double salario;
    String data;
    String rg;
    boolean ativo;
    
    void bonifica(double aumenta)
    {
    
        salario+=(salario*aumenta)/100;
        
    }
    
    void demite()
    {
    ativo=false;
    
    }
}
