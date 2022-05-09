package clase;

public abstract class Handler {

    protected Handler nextHandler;
    protected int prag;
    public Handler(Handler nextHandler, int prag) {
        super();
        this.nextHandler = nextHandler;
        this.prag = prag;
    }



    public Handler(int prag) {
        super();
        this.prag = prag;
        nextHandler=null;
    }



    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void setPrag(int prag) {
        this.prag = prag;
    }

    public abstract void  afiseazaCuCatSeDeplaseaza(int distanta);
}