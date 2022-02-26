package gft.gcs.labs.gof.subsistema2.cep;

public class CepApi {

    private static CepApi instacia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instacia;
    }

    public String recuperarCidade(String cep){
        return "Campo Grande";
    }

    public String recuperarEstado(String cep){
        return "MS";
    }
}
