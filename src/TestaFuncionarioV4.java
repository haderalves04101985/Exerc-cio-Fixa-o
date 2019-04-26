
public class TestaFuncionarioV4 {
    public static void main(String[] Args){
    
    FuncionarioV4 func4=new FuncionarioV4();
    func4.nome="Daniel";
    func4.departamento="Gerencia";
    func4.rg="MG99999999";
    func4.salario=10000;
    func4.ativo=true;
    
    Data d4=new Data();
    d4.dia=01;
    d4.mes=05;
    d4.ano=2019; 
    
    func4.data_ent=d4;
    
    FuncionarioV4 func5=new FuncionarioV4();
    func5.nome="Daniel";
    func5.departamento="Gerencia";
    func5.rg="MG99999999";
    func5.salario=10000;
    func5.ativo=true;
    
    Data d5=new Data();
    d5.dia=01;
    d5.mes=05;
    d5.ano=2019; 
    
    func5.data_ent=d5;
    
    func4.mostrar();
    func5.mostrar();
    
    func4.equals(func5);
    
    }
            
            
}


//a) Vai acontecer algum erro? Se sim, diga em qual linha e o motivo.
//b) Se houver erro(s), imagine que a(s) linha(s) que causa(m) erro(s) não existe(m)
//mais. Diga o que seriam impresso pelo programa e a(s) respectiva(s) linha(s).