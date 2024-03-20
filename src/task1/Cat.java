package task1;

public class Cat extends Animal {

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }

    private Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    public static Cat create(String name, int maxRun, int maxSwim){
        if (name==null || name.length() < 3){
            throw new RuntimeException("Имя животного указано некорректно.");
        }
        if (maxRun < 0 || maxSwim < 0){
            throw new RuntimeException("Параметры животного должны быть указаны корректно");
        }

        return new Cat(name, maxRun, maxSwim);
    }
}
