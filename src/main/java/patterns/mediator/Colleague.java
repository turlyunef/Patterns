package patterns.mediator;

public interface Colleague {
    String getName();

    void handleEvent();

    void broadcastEvent();
}