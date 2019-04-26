public class TestaCasa {
public static void main(String[] Args)
{

Casa casa1=new Casa();
casa1.cor="amarela";

Porta porta1=new Porta();
porta1.aberta=false;
porta1.cor="azul";
porta1.dimensaoX=160;
porta1.dimensaoY=160;
porta1.dimensaoZ=6;

Porta porta2=new Porta();
porta1.aberta=false;
porta2.cor="verde";
porta2.dimensaoX=160;
porta2.dimensaoY=160;
porta2.dimensaoZ=5;

Porta porta3=new Porta();
porta1.aberta=false;
porta3.cor="roxa";
porta3.dimensaoX=160;
porta3.dimensaoY=160;
porta3.dimensaoZ=8;

casa1.porta1=porta1;
casa1.porta2=porta2;
casa1.porta3=porta3;


porta3.aberta=true;
porta1.aberta=true;
porta2.aberta=true;

System.out.println(casa1.quantasPortasEstaoAbertas());

}
        
}
