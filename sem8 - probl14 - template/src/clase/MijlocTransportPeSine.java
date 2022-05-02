package clase;

public abstract class MijlocTransportPeSine {
    protected abstract void opresteInStatie1();
    protected abstract void opresteInStatie2();
    protected abstract void opresteInStatie3();

    public final void parcurgeTraseuInSensNormal(){
        opresteInStatie1();
        opresteInStatie2();
        opresteInStatie3();
    }
    public final void parcurgeTraseuInSensInvers(){
        opresteInStatie3();
        opresteInStatie2();
        opresteInStatie1();
    }

}
