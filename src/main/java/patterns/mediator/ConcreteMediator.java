package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void broadcastEvent(Colleague ignoredColleague) {
        for (Colleague colleague : colleagues) {
            if (colleague != ignoredColleague) {
                colleague.handleEvent();
            }
        }
    }
}