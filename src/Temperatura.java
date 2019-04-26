public class Temperatura {

double converterParaFarenheit(double far)
        
{
    double calc;
    calc=((far/5)*9)+32;
    return calc;

}

double converterParaCelsius(double cel)

{
       double calc;
       calc=((cel-32)/9)*5;
       return calc;
}

}
