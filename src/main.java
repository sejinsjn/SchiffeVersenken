import ships.BigShip;
import ships.RllyBigShip;
import ships.Ship;

public class main {

    public static void main(String[] args) {
        Ship big = new BigShip();
        Ship rllybig = new RllyBigShip();

        System.out.println(big.toString());
        System.out.println(rllybig.toString());
        System.out.println(big.toString());
    }
}
