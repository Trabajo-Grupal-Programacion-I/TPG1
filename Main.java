package EjemploAsociacion;

public class Main {
    public void main(String[] args){
        Persona p1 = new Persona();
        Compra c1 = new Compra();
        Vehiculo v1 = new Vehiculo("bicicleta");
        Vehiculo v2 = new Vehiculo("Ford Fiesta");
        Vehiculo v3 = new Vehiculo("Ford Maverick");

        p1.setCompra(c1);
        p1.agregarvehiculos(v1);
        p1.agregarvehiculos(v2);
        p1.agregarvehiculos(v3);

        System.out.println("p1 tinene estos vehiculos");
        p1.mostrarVehiculos();
    }
}
