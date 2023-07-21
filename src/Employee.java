import java.util.Objects;

public class Employee {
    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)//кога передали один и тот же объект, то есть сравниваеются ссылки
            return true;
        if (obj instanceof Employee){//если obj который передали явл типом дпнных Employee
            Employee employee = (Employee)obj;//преобразование obj к типу Employee
            if (name.equals(employee.name) && employee.age == age)//логика сравнения
                return true;
        }
        return false;
    }

}
