import com.entity.Arriendo;
import com.entity.Cliente;
import com.entity.Vehiculo;

import java.time.LocalDate;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Cliente juanitoPerez = new Cliente("Juanito Perez", "12345678-9", true);
        Cliente.mensaje("VIGENCIA DEL CLIENTE ES: "+ juanitoPerez.getVigencia());

        Vehiculo vehiculo =
                new Vehiculo("QWERRRRR", "FORD", 2000, "ECO SPORT", 'D');
        Vehiculo.mensaje("ESTADO DEL VEHICULO ES: "+ vehiculo.getCondicionVehiculo());
        juanitoPerez.deshablilitar();
        Cliente.mensaje("VIGENCIA DEL CLIENTE ES: "+ juanitoPerez.getVigencia());
        vehiculo.enMantencion();
        Vehiculo.mensaje("ESTADO DEL VEHICULO ES: "+ vehiculo.getCondicionVehiculo());

        LocalDate localDateOk = LocalDate.of(2022,10,27);
        Vehiculo vehiculoOk = new Vehiculo("QUEPED-O", "FORD", 2016, "ECO SPORT", 'D');
        Cliente clienteOk = new Cliente("Juancho Ramirez", "13579678-k", true);
        Arriendo arriendoOk =
                new Arriendo(RandomGenerator.getDefault().nextInt(1,10),localDateOk,vehiculoOk,clienteOk,60000,7 );

        arriendoOk.arrendar();
        Vehiculo.mensaje("ESTADO DEL VEHICULO ES: "+ arriendoOk.getVehiculo().getCondicionVehiculo());
        //TODO generar ticket
        arriendoOk.generarTicket();
        arriendoOk.devolucion(arriendoOk.getVehiculo());
        Vehiculo.mensaje("ESTADO DEL VEHICULO ES: "+ arriendoOk.getVehiculo().getCondicionVehiculo());
        LocalDate localDateko = LocalDate.of(2022,10,27);
        Vehiculo vehiculoko = new Vehiculo("QUEPEDOO3", "FORD", 1999, "ECO SPORT", 'A');
        Cliente clienteko = new Cliente("Juancho Ramirez", "13579678-k", true);
        Arriendo arriendoko =
                new Arriendo(RandomGenerator.getDefault().nextInt(10), localDateko,vehiculoko,clienteko,60000,11 );

        Arriendo arriendoko2 =
                new Arriendo(RandomGenerator.getDefault().nextInt(),localDateko,vehiculoko,clienteko,60000,10 );
        Vehiculo vehiculoko2 = new Vehiculo("QUEPEDO5", "FORD", 2000, "ECO SPORT", 'A');
        arriendoko2.devolucion(vehiculoko2);

    }
}