package seminar7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, Vacancy vacancy);

    boolean getFlag();
}
