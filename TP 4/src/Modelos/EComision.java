package Modelos;

public class EComision extends Empleado{
    private int cantClientes;
    private double bonoPorCliente;

    public EComision(String dni, String nombre, String apellido, int anioIngreso, int cantClientes, double bonoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.cantClientes = cantClientes;
        this.bonoPorCliente = bonoPorCliente;
    }

    public EComision(int cantClientes, double bonoPorCliente) {
        this.cantClientes = cantClientes;
        this.bonoPorCliente = bonoPorCliente;
    }
    public EComision()
    {
        this.cantClientes=0;
        this.bonoPorCliente=0;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public void setBonoPorCliente(double bonoPorCliente) {
        this.bonoPorCliente = bonoPorCliente;
    }
    public double salarioActualizado()
    {
        double salario=cantClientes*bonoPorCliente;
        if(salario<750)
        {
            salario=750;
        }
        return salario;
    }

    public double getBonoPorCliente() {
        return bonoPorCliente;
    }

    @Override
    public String imprimir() {
        double salario=salarioActualizado();
        return super.imprimir()+" "+getBonoPorCliente()+" "+getCantClientes()+" "+salario;
    }

    @Override
    public String toString() {
        double salario=salarioActualizado();
        return "EComision{" +
                "cantClientes= " + cantClientes +
                ", salario= " + salario +
                ", bonoPorCliente= " + bonoPorCliente +
                "} " + super.toString();
    }
}
