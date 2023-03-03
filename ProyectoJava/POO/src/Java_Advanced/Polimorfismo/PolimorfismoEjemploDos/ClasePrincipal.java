package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        ClasePadre suman = new ClaseHijaSuma();
        suman.pedirDatos();
        suman.Operaciones();
        suman.mostrarResultado();

        ClasePadre resta = new ClaseHijaResta();
        resta.pedirDatos();
        resta.Operaciones();
        resta.mostrarResultado();

    }
}
