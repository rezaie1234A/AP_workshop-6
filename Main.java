
public class Main {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah("Cheetah","12 Years", "120 Kmh","The fastest");
        Eagle eagle = new Eagle("Eagle","10 Years","1000M","Sharp Eyes");
        Girafe girafe = new Girafe("Girafe","5 Years","40 kmh","Long Neck");
        Parrot parrot = new Parrot("Parrot", "5 Years","100M", "Speaking");

        cheetah.show();
        eagle.show();
        girafe.show();
        parrot.show();

        System.out.println();

        cheetah.hunt();
        girafe.getName();

        eagle.hunt();
        parrot.getName();
    }
}