package facades;

import javax.persistence.Persistence;

public class Facade {

    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);
    }
}
