public class Developer implements Employee {

    private String name;
    private String job;

    public Developer(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public void work() {

        System.out.println("Я работаю как гусь");
        analyzeCode();
    }

    @Override
    public void coffeeTime() {

    }
    public void analyzeCode() {
        int a = 1;
        int b = 2;

        System.out.println(a+b);
    }
}
