
public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private int contadorId = 1; 
    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }
    public void registrarUsuario(String nombreUsuario) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario, contadorId++);
        System.out.println("Usuario " + nuevoUsuario.getNombre() + " registrado en el gimnasio " + nombre + " con ID: " + nuevoUsuario.getId() );
    }
    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");
        miGimnasio.registrarUsuario("Ana Santana");
    }
}
class Usuario {
    protected String nombre;
    protected int id;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
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
    }
