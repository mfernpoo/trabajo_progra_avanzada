import com.entity.Vehiculo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.validarPatente("123456789");
        System.out.println(vehiculo.getPatente());
    }
}