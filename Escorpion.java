package HerenciayPolimorfismo;

public class Escorpion extends Animal{
    private boolean esVenenoso;

    //constructor
    public Escorpion(String especie, boolean esVenenoso) {
        super(especie);
        this.esVenenoso = esVenenoso;
    }

    //getter
    public boolean isEsVenenoso() {
        return esVenenoso;
    }
    //setter
    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    @Override
    public void comer() {
        System.out.println("yo como insectos");
    }
}
