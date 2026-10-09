import java.util.ArrayList;

public class PerfilUsuario {

    String nombre;
    int pasosAcumulados;
    ArrayList<String> insigniasObtenidas;

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
        this.pasosAcumulados = 0;
        this.insigniasObtenidas = new ArrayList<>();
    }

    public void otorgarInsignia(String nombreInsignia) {
        insigniasObtenidas.add(nombreInsignia);
        System.out.println("¡Insignia obtenida: " + nombreInsignia + "!");
    }
}