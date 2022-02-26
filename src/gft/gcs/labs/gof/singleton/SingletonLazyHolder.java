package gft.gcs.labs.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * @author glauciocoutinho
 */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
