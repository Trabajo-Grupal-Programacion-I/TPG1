package HerenciayPolimorfismo;

public abstract class Animal {
    protected String especie;
    //constructor
    public Animal(String especie) {
        this.especie = especie;
    }

    public void hacerSonido(String sonido){
        System.out.println(sonido+" "+sonido+" "+sonido);
    }

    public abstract void comer();

}
