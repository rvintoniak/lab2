/**
 * Created by us8610 on 15.07.14.
 */
public class EmployeeFixed extends AbstractEmployee {
    @Override
    public void calcSalary() {
        this.avgSalary = this.rate;
    }

    public EmployeeFixed(int id, String name,int rate) {
        super(id, name,rate);
        calcSalary();
    }
}
