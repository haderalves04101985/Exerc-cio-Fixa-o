public class TestaPessoa {
    public static void main(String[] Args)
    {
    Pessoa p1=new Pessoa();
    p1.nome="theo";
    p1.idade=20;
    
    System.out.println("Idade: "+p1.idade);
    
    p1.fazAniversario();
    System.out.println("Idade: "+p1.idade);
    
    p1.fazAniversario();
    p1.fazAniversario();
    System.out.println("Idade: "+p1.idade);
    
}

}