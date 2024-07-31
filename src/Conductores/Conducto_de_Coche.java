package Conductores;

public class Conducto_de_Coche extends Conductor {
    private String Experiencia;

    public String getExperiencia() {
        return Experiencia;
    }

    public Conducto_de_Coche(String nombre, String Licencia) {
        super(nombre, Licencia);
    }
    @Override
    public void mostrarInformacion() {

        System.out.println("Nombre: " + getNombre());
        System.out.println("Licencia: " + getLicencia());
        System.out.println("Experiencia: " + getExperiencia());
    }

}
