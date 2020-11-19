public class Developer implements Employee {

    private String name;
    private String department;
    private int grade;

    public int getGrade() {
        return grade;
    }

    public Developer(String name, String department,int grade) {
        this.name = name;
        this.department = department;
        this.grade = grade;
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

        System.out.println(a + b);
    }



}