package task1;

public class Program {

    public static void main(String[] args) {


        try
        {
            Cat cat1 = Cat.create("Армандо", -1000, 0);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        Animal[] animals = {
                Cat.create("Армандо", 1000, 0),
                new Dog("Шарик", 200, 300),
                Cat.create("Персик", 3000, 0),
                new Dog("Тузик", 200, 100),
                Cat.create("Бима", 400, 4000),
        };



        for (Animal a : animals){
            a.run(200);
            a.swim(10);
            a.run(1200);
            a.swim(210);
            a.run(3200);
            a.swim(210);
            a.run(2200);
            a.swim(150);
        }


        System.out.printf("Было создано %d животных\n", Animal.getCounter());
        System.out.printf("Было создано %d котов\n", Cat.getCounter());
        System.out.printf("Было создано %d собак\n", Dog.getCounter());


    }

}
