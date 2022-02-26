package gft.gcs.labs.gof.singleton;


/**
 * Singleton "preguiçoso"
 * @author glauciocoutinho
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
