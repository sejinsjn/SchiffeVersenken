package ships;

public abstract  class Ship {

    private String name;
    private boolean body[];
    private boolean isDestroyed = false;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return body.length;
    }

    public void setBody(boolean[] body) {
        this.body = body;
    }
    public boolean[] getBody() {
        return body;
    }

    public boolean isDestroyed() {
        if (!isDestroyed)
            for (boolean b : body)
                if (b)
                    return false;
        return true;
    }

    public void gotHit(int where) {
        if(!isDestroyed)
            body[where] = false;
    }

    @Override
    public String toString(){
        return getName();
    }
}
