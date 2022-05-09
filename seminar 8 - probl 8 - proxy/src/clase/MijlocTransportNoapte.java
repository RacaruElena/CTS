package clase;

public class MijlocTransportNoapte implements MijlocTransport {
    private MijlocTransport mijlocTransport;
    //daca vrem sa facem proxy-ul pt intreaga familie, declaram MijlocTransport, dar nu avem acces la nr de calatori(facem getter)


    public MijlocTransportNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie() {
        if (mijlocTransport.getNrCalatori() > 0) {
            mijlocTransport.opresteInStatie();
        } else {
            System.out.println("Autobuzul de noapte nu opreste in statie!");
        }

    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }
}
