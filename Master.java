package seminar7.observer;

public class Master implements Observer{

    private String name;
    private int salary;
    private boolean flag;

    public Master(String name){
        this.name = name;
        salary = 80000;
        flag = true;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancy.getNameVacancy() == "Junior"){
            System.out.printf("Я слишком опытен для такой работы. Отказано. (Соискатель: %s; компания: %s; должность: %s)\n",
                        name, nameCompany, vacancy.getNameVacancy());
        }
        else{
            if (this.salary <= vacancy.getSalary()){
                System.out.printf("Специалист с большим опытом %s: Мне нужна эта работа! (компания: %s; заработная плата: %d, должность: %s)\n",
                        name, nameCompany, vacancy.getSalary(), vacancy.getNameVacancy());
                    this.salary = vacancy.getSalary();
                    flag = false;
            }
            else {
                System.out.printf("Специалист с большим опытом %s: Я найду работу получше! (компания: %s; заработная плата: %d, должность: %s)\n",
                        name, nameCompany, vacancy.getSalary(), vacancy.getNameVacancy());
            }
        }
    }

    @Override
    public boolean getFlag() {
        return flag;
    }
    
}
