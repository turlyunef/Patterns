package patterns.mediator;

public class ConcreteColleague implements Colleague {
    private Mediator mediator;
    private String name;

    ConcreteColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void handleEvent() {
        System.out.printf("Event occurred in %s!%n", this.name);
    }

    @Override
    public void broadcastEvent() {
        this.mediator.broadcastEvent(this);
    }
}