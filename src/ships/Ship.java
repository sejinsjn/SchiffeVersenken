package ships;

public interface Ship {

    String getName();

    int getSize();

    boolean[] getBody();

    boolean isDestroyed();

    void gotHit(int where);
}
