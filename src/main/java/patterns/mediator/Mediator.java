package patterns.mediator;

public interface Mediator {
    void addColleague(Colleague colleague);

    void broadcastEvent(Colleague colleague);
}