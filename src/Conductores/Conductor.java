package Conductores;

public class Conductor {
    private String nombre;
    private String Licencia;


    public Conductor(String nombre, String Licencia) {
        this.nombre = nombre;
        this.Licencia = Licencia;
    }
    public String getNombre() {
        return nombre;
    }
    public String getLicencia() {
        return Licencia;
    }

    public void mostrarInformacion(){
        System.out.println("Esta es la informacion del conductor" + nombre + "_" + Licencia);
    }







}
