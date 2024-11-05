package HerenciayPolimorfismo;

public class Gato extends Animal implements Domesticable{
    private String color;

    //constructor
    public Gato(String especie, String color) {
        super(especie);
        this.color = color;
    }
    //getter
    public String getColor() {
        return color;
    }
    //setter
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void comer() {
        System.out.println("yo como pescado");
    }

    @Override
    public void acariciar() {
        System.out.println("yo no me dejo acariciar");
    }
}
