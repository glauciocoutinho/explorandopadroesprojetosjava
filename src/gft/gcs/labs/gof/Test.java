package gft.gcs.labs.gof;

import gft.gcs.labs.gof.facade.Facade;
import gft.gcs.labs.gof.singleton.SingletonEager;
import gft.gcs.labs.gof.singleton.SingletonLazy;
import gft.gcs.labs.gof.singleton.SingletonLazyHolder;
import gft.gcs.labs.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        Facade facade = new Facade();
    facade.migrarCliente("Pedro", "79900000");
    }
}
