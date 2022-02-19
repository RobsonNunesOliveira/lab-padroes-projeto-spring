package one.digitalinnovation.labpadroesprojetospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public String getCep() {

        return cep;
    }
    public void setCep(String cep) {

        this.cep = cep;
    }
}
