
public class Girafe extends Mammal implements Prey{
    protected  String specialProperty;

    public Girafe(String name, String age, String speed, String specialProperty) {
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
    public void getName() {
        System.out.println(name);
    }
}