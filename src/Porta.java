
public class Porta {

boolean aberta;
String cor;
double  dimensaoX, dimensaoY, dimensaoZ;

void abre()
{
aberta=true;
    
};

void fecha()      
{
aberta=false;

}

void pinta(String s)
{
cor=s;

}

boolean estaAberta()
        
{
return this.aberta;

}

}
