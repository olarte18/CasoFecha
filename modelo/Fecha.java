package modelo ;
public class Fecha
{
    //Atributos
    private int dia ;
    private int mes ;
    private int anio ;

    //Metodos
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    //metodos

    public String toString()
    {
        return dia +"/"+mes+"/"+anio ;
    }

    public boolean equals(Object o)
    {
        Fecha otra=(Fecha)o;
        return (dia==otra.dia)&&(mes==otra.mes)&&(anio==otra.anio);

    }
}