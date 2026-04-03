package co.edu.poli.contexto3.servicios;

import co.edu.poli.contexto3.modelo.*;

public class Quimico extends Cientifico {

    private String especializacion;
    private String sexo;
    private static String uniforme;

    public Quimico() {
    }

    public Quimico(String nombre, String id, String sexo) {
        super(nombre, id, sexo);
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public static String getUniforme() {
        return uniforme;
    }

    public static void setUniforme(String uniforme) {
        Quimico.uniforme = uniforme;
    }

    public static double calcularedad(int anioactual) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"Quimico{" +
                "nombre='" + getNombre() + '\'' +
                ", id='" + getId() + '\''+
                "especializacion='" + especializacion + '\'' +
                ", sexo='" + sexo + '\'' +
                ", uniforme='" + uniforme + '\'' +
                '}';
    }

    public int operacion(int i) {
        return i * 5;
    }
}