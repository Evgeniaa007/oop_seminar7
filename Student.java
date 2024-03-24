package seminar7.observer;

public class Student implements Observer {

    private String name;
    private int salary;
    private boolean flag;


    public Student(String name){
        this.name = name;
        salary = 5000;
        flag = true;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancy.getNameVacancy() == "Senior"){
            System.out.printf("Слишком мало опыта для такой должности (Соискатель: %s; компания: %s; должность: %s)\n", 
                        name, nameCompany, vacancy.getNameVacancy());
        }
        else{
            if (this.salary <= vacancy.getSalary()){
                System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d, должность: %s)\n",
                        name, nameCompany, vacancy.getSalary(), vacancy.getNameVacancy());
                this.salary = vacancy.getSalary();
                flag = false;
                
            }
            else {
                System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d, должность: %s)\n",
                        name, nameCompany, vacancy.getSalary(), vacancy.getNameVacancy());
            }
        }
    }

    @Override
    public boolean getFlag() {
        return flag;
    }
    
}
