import Modelos.EAsalariado;
import Modelos.EComision;
import Modelos.Empleado;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*Existen dos categorías de personal: el personal con salario fijo y el personal a comisión.
         Los empleados con salario fijo tienen un sueldo básico y un porcentaje adicional
         en función del número de años que llevan: menos de dos años salario base,
         de 2 a 3 años: 5% más; de 4 a 7 años: 10% más; de 8 a 15 años: 15% más y más de 15 años: 20% más. */

        Empleado[] arregloEmpleados= new Empleado[25];
        int anio=LocalDateTime.now().getYear();
        /*Javier Gómez, DNI: 569587A, desde 2008, salario fijo base = 1225.00$.
        Eva Nieto, DNI: 695235B, desde 2010, 179 clientes captados a 8.10$ cada uno.
        José Ruiz, DNI: 741258C, desde 2012, 81 clientes captados a 7.90$ cada uno.
        María Núñez, DNI: 896325D, desde 2013, salario fijo base = 1155.00$*/

        Empleado javierGomez=new EAsalariado("5695874A","Javier","Gomez",2008,1225.00,anio-2008);
        Empleado evaNieto = new EComision("695235B","Eva","Nieto",2010,179,8.10);
        arregloEmpleados[0]=javierGomez;
        arregloEmpleados[1]=evaNieto;
        System.out.println(arregloEmpleados[1].imprimir());
        System.out.println(arregloEmpleados[0].imprimir());
        System.out.println(arregloEmpleados[0].toString());

    }
}