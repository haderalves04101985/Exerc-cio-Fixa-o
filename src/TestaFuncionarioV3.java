public class TestaFuncionarioV3 {
    
    public static void main(String[] Args){
    
    FuncionarioV3 func3=new FuncionarioV3();
    func3.nome="Daniel";
    func3.departamento="Gerencia";
    func3.rg="MG99999999";
    func3.salario=10000;
    func3.ativo=true;
    
    Data d3=new Data();
    d3.dia=01;
    d3.mes=05;
    d3.ano=2019; 
    
    func3.data_ent=d3;
    
    func3.mostrar();
}
    
}