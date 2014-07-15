
public abstract class AbstractEmployee implements Salary, Comparable<AbstractEmployee> {


    int id;

    String name;

    double avgSalary;

    int rate;

    @Override
    public int compareTo(AbstractEmployee that) {
        if (this.avgSalary!=that.avgSalary)
            return (int) (that.avgSalary-this.avgSalary);
        return this.name.compareTo(that.name);
    }

    protected AbstractEmployee(int id, String name, int rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "AbstractEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avgSalary=" + avgSalary +
                '}';
    }
}
