/**
 * Created by us8610 on 15.07.14.
 */
public class EmployeePerHour extends AbstractEmployee {
    @Override
    public void calcSalary() {
        this.avgSalary = 20.8 * 8 * this.rate;
    }

    public EmployeePerHour(int id, String name, int rate) {
        super(id, name,rate);
        calcSalary();
    }
}
