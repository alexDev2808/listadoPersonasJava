public class Persona {

    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numPersonas = 0;

//    constructor vacio
    public Persona() {
        this.id = ++Persona.numPersonas;
    }

    // sobrecarga de constructores
    // constructor con argumentos
    public Persona( String nombre, String tel, String email ) {
        this(); // se llama el constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", tel='" + tel + '\'' +
               ", email='" + email + '\'' +
               '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Alexis", "34565", "mail@test.com");
        System.out.println(persona1);
    }
}
