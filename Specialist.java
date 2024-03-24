package seminar7.observer;

public class Specialist implements Observer{
    private String name;
    private int salary;
    private boolean flag;



    public Specialist(String name){
        this.name = name;
        salary = 35000;
        flag = true;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d, должность: %s)\n",
                    name, nameCompany, vacancy.getSalary(), vacancy.getNameVacancy());
                this.salary = vacancy.getSalary();
                flag = false;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d, должность: %s)\n",
                    name, nameCompany, vacancy.getSalary(), vacancy.getNameVacancy());
        }
    }

    @Override
    public boolean getFlag() {
        return flag;
    }
}
