public class Eagle extends Birds implements Hunter {
    protected  String specialProperty;
    public Eagle(String name, String age, String flyHeight, String specialProperty) {
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
    public void hunt() {
        System.out.print(name+" Hunts ");
    }
}