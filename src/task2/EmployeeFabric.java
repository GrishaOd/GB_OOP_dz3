package task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Панкратий"};
        String[] surenames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Лазарь", "Копылов"};

        double salary = random.nextInt(60000, 120001);
        int experience = random.nextInt(0, 41);
        return Worker.create(
                surenames[random.nextInt(surenames.length)],
                names[random.nextInt(names.length)],
                experience,
                salary);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Панкратий"};
        String[] surenames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Лазарь", "Копылов"};

        double salary = 20.8 * 8 * 1200; // расчёт заработной платы фрилансера с учётом фиксированной ставки, которая обозначается в классе Freelancer
        int experience = random.nextInt(0, 41);
        return Freelancer.create(
                surenames[random.nextInt(surenames.length)],
                names[random.nextInt(names.length)],
                experience,
                salary);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        int numOfWorkers = random.nextInt(1, count+1);
        Employee[] employees = new Employee[count];
        for (int i = 0; i < numOfWorkers; i++) {
            employees[i] = generateWorker();
            System.out.println("создан worker");
        }
        for (int i = numOfWorkers; i < count; i++) {
            employees[i] = generateFreelancer();
            System.out.println("создан freelancer");
        }
        return employees;
    }


}
