public class Parrot extends Birds implements Prey {
    protected  String specialProperty;

    public Parrot(String name, String age, String flyHeight, String specialProperty) {
        super(name, age, flyHeight);
        this.specialProperty = specialProperty;
    }
    protected void specialProperty(){
        System.out.println('"'+specialProperty+'"');
    }
    @Override
    void show() {
        showAnimal();
        showBird();
        specialProperty();
    }
    @Override
    public void getName() {
        System.out.println(name);
    }
}