package task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee{

    private Worker(String surName, String name, int experience, double salary) {
        super(surName, name, experience, salary);
    }

    public static Worker create(String surName, String name, int experience, double salary){
        return new Worker(surName, name, experience, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public int showExperience(){ return experience; }

    @Override
    public String toString() {
        return String.format("%s %s; опыт работы: %d лет; ставка: %.2f руб.; заработная плата: %.2f руб.",
                sureName, name, experience, salary, calculateSalary());
    }
}
