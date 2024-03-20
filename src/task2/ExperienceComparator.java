package task2;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.showExperience(), o1.showExperience());
    }
}
