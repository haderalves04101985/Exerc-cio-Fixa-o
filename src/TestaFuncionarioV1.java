/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hader
 */
public class TestaFuncionarioV1 {
    public static void main(String[] Args)
    {
    FuncionarioV1 func1= new FuncionarioV1 ();
    func1.nome="Hader";
    func1.departamento="GSUP";
    func1.rg="MG14323196";
    func1.salario=2200;
    func1.data="25/04/2019";
    func1.ativo=true;   
    
    func1.bonifica(4);
    System.out.println("Novo salário: R$"+func1.salario);
    
    func1.demite();
    System.out.println("Ativo: "+func1.ativo);
   
    }
    

    
}
