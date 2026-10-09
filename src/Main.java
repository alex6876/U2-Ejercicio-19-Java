public class Main {

    public static void main(String[] args) {

        PerfilUsuario usuario = new PerfilUsuario("Juan");

        PulseraInteligente pulsera = new PulseraInteligente(usuario);

        pulsera.registrarPasos(4000);
        pulsera.registrarPasos(3500);
        pulsera.registrarPasos(3000);

        System.out.println("--------------------");
        System.out.println("Nombre: " + usuario.nombre);
        System.out.println("Total de pasos: " + usuario.pasosAcumulados);
        System.out.println("Insignias obtenidas: " + usuario.insigniasObtenidas);
    }
}