
public class TestaPorta {
public static void main(String[] Args)
        
{

Porta port1=new Porta();
port1.aberta=true;
port1.aberta=false;
port1.cor="azul";
port1.cor="rosa";
port1.dimensaoX=150;
port1.dimensaoZ=60;
port1.dimensaoY=5;

System.out.println(port1.estaAberta());
port1.aberta=true;
System.out.println(port1.estaAberta());
port1.aberta=false;
System.out.println(port1.estaAberta());

}
}
