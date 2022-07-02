package ships;

public class RllyBigShip implements Ship{

    private String name;
    private boolean body[];
    private boolean isDestroyed = false;

    public RllyBigShip(){
        name = "RllyBigShip";
        body = new boolean[] {true, true, true, true, true};
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return body.length;
    }

    @Override
    public boolean[] getBody() {
        return body;
    }

    @Override
    public boolean isDestroyed() {
        if (!isDestroyed)
            for (boolean b : body)
                if (b)
                    return false;
        return true;
    }

    @Override
    public void gotHit(int where) {
        if(!isDestroyed)
            body[where] = false;
    }
}
