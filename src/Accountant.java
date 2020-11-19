public class Accountant implements Employee {
    @Override
    public void work() {
        Calculation calc = new Calculation();
        calc.calculateSalary();
    }

    @Override
    public void coffeeTime() {

    }
}
