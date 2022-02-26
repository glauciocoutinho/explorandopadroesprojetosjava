package gft.gcs.labs.gof.facade;

import gft.gcs.labs.gof.subsistema1.crm.CrmService;
import gft.gcs.labs.gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
