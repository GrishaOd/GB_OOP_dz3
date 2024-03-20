package task2;

public abstract class Employee implements Comparable<Employee> {

//    @Override
//    public int compareTo(Employee o) {
//        int sureNameRes = sureName.compareTo(o.sureName);
//        if (sureNameRes == 0){
//            return name.compareTo(o.name);
//        }
//        return sureNameRes;
//    }

    @Override
    public int compareTo(Employee o) {
        int expRes = experience.compareTo(o.experience);
        if (expRes == 0){
            return experience.compareTo(o.experience);
        }
        return expRes;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String sureName;

    /**
     * Рабочий опыт
     */
    protected Integer experience;


    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчёт среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    /**
     * Отображение рабочего опыта сотрудника
     * @return рабочий опыт
     */
    public abstract int showExperience();

    public Employee(String sureName, String name, int experience, double salary) {
        this.sureName = sureName;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
}
