public class VesrionManager {


    private int version = 0;


    public void majeur() {
        this.version += 100;
    }
    public void mineur() {
        this.version += 10;
    }
    public void patch() {
        this.version += 1;
    }

    public int getVersion()

    {
        return this.version ;
    }
    public void setVersion(int nb) {
        this. version = nb;
    }

    public void reset() {

    }
}
