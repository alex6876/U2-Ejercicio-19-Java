public class PulseraInteligente {

    PerfilUsuario perfil;
    int metaDiaria = 10000;
    boolean insigniaEntregada = false;

    public PulseraInteligente(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void registrarPasos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de pasos debe ser mayor que cero.");
            return;
        }

        perfil.pasosAcumulados = perfil.pasosAcumulados + cantidad;

        System.out.println("Pasos registrados: " + cantidad);
        System.out.println("Pasos acumulados: " + perfil.pasosAcumulados);

        if (perfil.pasosAcumulados >= metaDiaria && !insigniaEntregada) {
            perfil.otorgarInsignia("Meta diaria alcanzada");
            insigniaEntregada = true;
        }
    }
}