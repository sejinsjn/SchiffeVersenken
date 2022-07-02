package ships;

import java.util.LinkedList;
import java.util.List;

public class shipBuilder {

    private List<Ship> ships;

    public void build(){
        ships = new LinkedList<>();

        ships.add(new SmallShip());
        ships.add(new SmallShip());
        ships.add(new SmallShip());
        ships.add(new SmallShip());

        ships.add(new MediumShip());
        ships.add(new MediumShip());
        ships.add(new MediumShip());

        ships.add(new BigShip());
        ships.add(new BigShip());

        ships.add(new RllyBigShip());
    }

    public List<Ship> getShipList(){
        return ships;
    }
}
