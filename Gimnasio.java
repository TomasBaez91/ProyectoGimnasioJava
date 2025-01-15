
public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private int contadorId = 00001; // Contador para los IDs de los usuarios

    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }

    }

    public void registrarUsuario(String nombreUsuario, String actividad) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario, contadorId++, actividad);
        System.out.println("Usuario " + nuevoUsuario.getNombre() + " registrado en el gimnasio " + nombre + " con ID: " + nuevoUsuario.getId() + " y actividad: " + nuevoUsuario.getActividad() );
    }
    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez", "Boxeo");
        miGimnasio.registrarUsuario("Ana Santana", "Yoga");
    }
}
class Usuario {
    protected String nombre;
    protected int id;
    protected String actividad;

    public Usuario(String nombre, int id, String actividad) {
        this.nombre = nombre;
        this.id = id;
        this.actividad = actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
