package ejecutable;

import java.net.SocketTimeoutException;

import modelo.Fecha;

public class Test {
public static void main(String[] args)
 {
    Fecha f =new Fecha(11,05,2023);


    System.out.println("Dia= "+ f.getDia());
    System.out.println("Mes= "+ f.getMes());
    System.out.println("Anio= "+ f.getAnio());
    System.out.println(f);

    Fecha f2 =new Fecha(11,05,2023);


    System.out.println(f.equals(f2));
}
}