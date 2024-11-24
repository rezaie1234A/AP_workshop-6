public abstract class Animal {
    protected  String name;
    protected  String age;

    public Animal(String name, String age){
        this.age = age;
        this.name = name;

    }
    protected void showAnimal(){
        System.out.print("Name:"+name + ", Age:"+ age);
    }

    abstract void show();

}