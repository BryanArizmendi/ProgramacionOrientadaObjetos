package Java_Advanced.Polimorfismo.SobrecargaDeMetodo;

public class SobrecargaDeMetodo
{
    public void suma(int a, int b)
    {
        System.out.println("Resultado: " + (a + b));

    }
    public void suma(int a, int b, int c)
    {
        System.out.println("Resultado: " + (a + b + c));

    }

    public static void main(String[] args)
    {
        SobrecargaDeMetodo objSobrecarga = new SobrecargaDeMetodo();
        objSobrecarga.suma(100,100);
        objSobrecarga.suma(200,200,200);

    }
}
