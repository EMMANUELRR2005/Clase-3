package Conductores;

public class ConductorDeMoto extends Conductor {

    public ConductorDeMoto(String nombre, String Licencia) {
        super(nombre, Licencia);
    }

    private boolean TieneLicenciaMoto;

    public boolean TieneLicenciaMoto() {
        return TieneLicenciaMoto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Licencia: " + getLicencia());
        System.out.println("TieneLicenciaMoto: " + TieneLicenciaMoto);
    }

}
