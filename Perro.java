package HerenciayPolimorfismo;

public class Perro extends Animal implements Domesticable{
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }

    //getter
    public String getRaza() {
        return raza;
    }
    //setter
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println("yo como carne");
    }


    @Override
    public void acariciar() {
        System.out.println("yo me dejo acariciar");
    }
}
