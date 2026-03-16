package factory;

import factory.creator.Logistics;
import factory.concretecreator.RoadLogistics;
import factory.concretecreator.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();
    }
}