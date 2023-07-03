package org.example;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Visitor> registeredVisitors;

    public Zoo() {
        this.registeredVisitors = new ArrayList<>();
    }

    public int registerVisitor(String firstName, String lastName, int credits) {
        int visitorId = generateVisitorId();
        Visitor visitor = new Visitor(visitorId, firstName, lastName, credits);
        registeredVisitors.add(visitor);
        return visitorId;
    }

    public void rechargeCredits(int visitorId, int amount) throws VisitorNotFoundException {
        Visitor visitor = findVisitorById(visitorId);
        if (visitor == null) {
            throw new VisitorNotFoundException("Visitor not found with ID: " + visitorId);
        }

        visitor.setCredits(visitor.getCredits() + amount);
    }

    private Visitor findVisitorById(int visitorId) {
        for (Visitor visitor : registeredVisitors) {
            if (visitor.getVisitorId() == visitorId) {
                return visitor;
            }
        }
        return null;
    }

    private int generateVisitorId() {
        // Implement your logic to generate a unique visitor ID
        return registeredVisitors.size() + 1;
    }
}
