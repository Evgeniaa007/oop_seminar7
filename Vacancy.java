package seminar7.observer;

import java.util.Random;


public class Vacancy {

    private String nameVacancy;


    private int salary;
    

    static Random random = new Random();
        
    public Vacancy(String nameVacancy, int salary) {
        this.nameVacancy = nameVacancy;
        this.salary = salary;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }
    
    public int getSalary() {
        return salary;
    }

    enum Vacancies{
        Junior,
        Middle,
        Senior
    }

    static Vacancy vacancyGenerator(Vacancies vacancies){
        Vacancy vacancy = null;
        switch (vacancies) {
            case Junior:
                int salary = random.nextInt(5000, 20000);
                vacancy = new Vacancy("Junior", salary);
                break;
            case Middle:
                salary = random.nextInt(20000, 80000);
                vacancy = new Vacancy("Middle", salary);
                break;
            case Senior:
                salary = random.nextInt(80000, 130000);
                vacancy = new Vacancy("Senior", salary); 
                break;     
        }
        return vacancy;
    
    }

    static Vacancy vacancyGenerator(){
        int typeIndex = random.nextInt(3);
        return switch (typeIndex) {
            case 0 -> vacancyGenerator(Vacancies.Junior);
            case 1 -> vacancyGenerator(Vacancies.Middle);
            case 2 -> vacancyGenerator(Vacancies.Senior);
            default -> null;
        };
    }


}
 