package seminar7.observer;

import java.util.ArrayList;
import java.util.Collection;


public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(String companyName, Vacancy vacancy){
        for (Observer observer : observers){
            observer.receiveOffer(companyName, vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver() {
        observers.removeIf(flag -> flag.getFlag() == false);
    }

}
