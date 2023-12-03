package rasi.urgencies.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "urgencias")
public class Urgency {

    @Id
    private String id;
    private String documento;
    private Boolean estado;

    // Constructor, getters y setters

    public Urgency(String id, String documento) {
        this.id = id;
        this.documento = documento;
        this.estado = true;
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;

    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
