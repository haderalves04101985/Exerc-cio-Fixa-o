
public class FuncionarioV1 {
    String funcionario;
    String departamento;
    double salario;
    String data;
    String rg;
    boolean ativo;
    
    void bonifica(double aumenta)
    {
    
        salario+=(salario*aumenta)/100;
        
    }
    
}
