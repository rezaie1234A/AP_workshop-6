public class Cheetah extends Mammal implements Hunter{
    protected  String specialProperty;

    public Cheetah(String name, String age, String speed, String specialProperty) {
        super(name, age, speed);
        this.specialProperty = specialProperty;
    }
    protected void specialProperty(){
        System.out.println('"'+specialProperty+'"');
    }

    @Override
    void show() {
        showAnimal();
        showMammal();
        specialProperty();
    }


    @Override
    public void hunt() {
        System.out.print(name+" Hunts ");
    }
}