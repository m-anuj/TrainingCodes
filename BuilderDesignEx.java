package org.example;

// House.java - Product
class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    void setStructure(String structure) {
        this.structure = structure;
    }

    void setRoof(String roof) {
        this.roof = roof;
    }

    void setInterior(String interior) {
        this.interior = interior;
    }

    void showHouse() {
        System.out.println("House with " + foundation + ", " + structure + ", " + roof + ", and " + interior);
    }
}

// HouseBuilder.java - Builder Interface
interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}

// SimpleHouseBuilder.java - Concrete Builder
class SimpleHouseBuilder implements HouseBuilder {
    private House house;

    SimpleHouseBuilder() {
        this.house = new House();
    }

    public void buildFoundation() {
        house.setFoundation("Basic foundation");
    }

    public void buildStructure() {
        house.setStructure("Standard walls");
    }

    public void buildRoof() {
        house.setRoof("Simple roof");
    }

    public void buildInterior() {
        house.setInterior("Basic interior");
    }

    public House getHouse() {
        return house;
    }
}

// Contractor.java - Director
class Contractor {
    private HouseBuilder houseBuilder;

    void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    House getHouse() {
        return houseBuilder.getHouse();
    }

    void constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }
}

// Client.java - Client Code
public class BuilderDesignEx {

    public static void main(String[] args) {
        Contractor contractor = new Contractor();
        HouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();

        contractor.setHouseBuilder(simpleHouseBuilder);
        contractor.constructHouse();

        House house = contractor.getHouse();
        house.showHouse();
    }
}
