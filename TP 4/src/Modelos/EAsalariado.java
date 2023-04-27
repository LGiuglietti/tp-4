package Modelos;

public class EAsalariado extends Empleado{
    private double salarioBase;
    private int antiguedad;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public EAsalariado(String dni, String nombre, String apellido, int anioIngreso, double salarioBase, int antiguedad) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
    }

    public EAsalariado(double salarioBase, int antiguedad) {
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
    }
    public  EAsalariado()
    {
        this.antiguedad=0;
        this.salarioBase=0;
    }
    public double calcularSalario()
    {
        double salario=1;
        if (antiguedad>15) {
            salario=salarioBase*1.2;
        }
        else if(antiguedad>=8)
        {
            salario=salarioBase*1.15;
        }
        else if(antiguedad>=4)
        {
            salario=salarioBase*1.10;
        }
        else if(antiguedad==2 || antiguedad==3)
        {
            salario=salarioBase*1.05;
        }
        else {
            salario=salarioBase;
        }
        return salario;
    }

    @Override
    public String imprimir() {
        double salarioActualizado=calcularSalario();
        return super.imprimir()+" "+getSalarioBase()+" "+getAntiguedad()+" "+salarioActualizado;
    }

    @Override
    public String toString() {
        return "EAsalariado{" +
                "salarioBase=" + salarioBase +
                ", antiguedad=" + antiguedad +
                "} " + super.toString();
    }
}
