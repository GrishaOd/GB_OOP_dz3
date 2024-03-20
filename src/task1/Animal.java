package task1;

public abstract class Animal {


//    static {
//        System.out.println("Static initializer");
//    }

    {
        System.out.println("Initializer");
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public Animal(String name) {
        System.out.println("Constructor");
        this.name = name;
    }

    public Animal() {
        System.out.println("Constructor");
    }

    public  void run(int distance){
        if (distance <= maxRun){
            System.out.printf("%s пробежал %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не удалось пробежать %d метров\n", name, distance);
        }
    }

    public  void swim(int distance){
        if (distance <= maxSwim){
            System.out.printf("%s проплыл %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не удалось проплыть %d метров\n", name, distance);
        }
    }



    private static int counter;

    public static int getCounter(){
        return counter;
    }


    protected String name;
    private int maxRun;
    private int maxSwim;


    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
