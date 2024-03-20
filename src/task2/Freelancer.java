package task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    protected double hourlyRate = 1200; // Фиксированая ставка в час

    public Freelancer(String name, String sureName, int experience, double salary) {
        super(name, sureName, experience, salary);
    }

    public static Freelancer create(String surName, String name, int experience, double salary){
        return new Freelancer(surName, name, experience, salary);
    }


    @Override
    public double calculateSalary() {
        return salary;
    }

    public int showExperience(){ return experience; }

    public String toString() {
        return String.format("%s %s; опыт работы: %d лет; ставка: %.2f руб.; заработная плата: %.2f руб.",
                sureName, name, experience, salary, calculateSalary());
    }



}
