import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    private SortType sortType;

    public EmployeeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {//логика сравнения двух Employee
        int nameRes = sortType == SortType.Ascending ? o1.getName().compareTo(o2.getName()) : //если сравнение идёт по стандарту, то сравнивается первый со вторым
                o2.getName().compareTo(o1.getName());// если идёт по убыванию, то сравнивается второй с первым

        if (nameRes == 0){
            return sortType == SortType.Ascending ? Integer.compare(o1.getAge(), o2.getAge()) :
                    Integer.compare(o2.getAge(), o1.getAge());
        }
        return nameRes;
    }
}
