package EjemploAsociacion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private Compra compra;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    //getter
    public Compra getCompra() {
        return compra;
    }

    //setter
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void agregarvehiculos(Vehiculo v){
        this.vehiculos.add(v);
    }

    public void mostrarVehiculos(){
        for (Vehiculo v : vehiculos){
            System.out.println(v.getTipo());
        }
    }
}
