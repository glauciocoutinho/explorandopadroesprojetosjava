package gft.gcs.labs.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author glauciocoutinho
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}