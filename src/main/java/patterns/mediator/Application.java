package patterns.mediator;

public class Application {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague = new ConcreteColleague(mediator, "First colleague");
        mediator.addColleague(colleague);

        Colleague colleague2 = new ConcreteColleague(mediator, "Second colleague");
        mediator.addColleague(colleague2);

        Colleague colleague3 = new ConcreteColleague(mediator, "Third colleague");
        mediator.addColleague(colleague3);

        System.out.println(colleague.getName() + " makes event:");
        colleague.broadcastEvent();
        System.out.println();

        System.out.println(colleague2.getName() + " makes event:");
        colleague2.broadcastEvent();
        System.out.println();

        System.out.println(colleague3.getName() + " makes event:");
        colleague3.broadcastEvent();
    }
}