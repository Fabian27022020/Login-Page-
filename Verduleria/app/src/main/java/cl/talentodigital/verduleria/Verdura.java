package cl.talentodigital.verduleria;

public class Verdura {

    private String nombreVerdura;
    private  String tipo;
    private int precio;

    public String getNombreVerdura() {
        return nombreVerdura;
    }

    public void setNombreVerdura(String nombreVerdura) {
        this.nombreVerdura = nombreVerdura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Verdura(String nombreVerdura, String tipo) {
        this.nombreVerdura = nombreVerdura;
        this.tipo = tipo;


    }
}
