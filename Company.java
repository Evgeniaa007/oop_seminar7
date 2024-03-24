package seminar7.observer;

import java.util.ArrayList;
import java.util.List;

public class Company {


    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    private Vacancy vacancy;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        vacancy = Vacancy.vacancyGenerator();
        jobAgency.sendOffer(name, vacancy);
    }
    
}
