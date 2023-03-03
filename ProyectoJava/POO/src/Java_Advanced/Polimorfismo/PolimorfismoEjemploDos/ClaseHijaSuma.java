package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClaseHijaSuma extends ClasePadre
{
    @Override //Esto se conoce como sobre escribir metodos, es decir. cuando estamos utilizando el polimorfismo
    public void Operaciones()
    {
        resultado = valorUno + valorDos;

    }
}
