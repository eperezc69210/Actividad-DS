import java.util.Date;

class Persona {
    protected String cedula;
    protected String nombre;
    protected Date fechaNacimiento;
    protected String lugarNacimiento;

    public Persona(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }
}

class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private double sueldo;

    public Profesor(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento,
                    String profesion, String nacionalidad, double sueldo) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
    }
}

class Carrera {
    private String nombre;
    private int creditosTotales;
    private int semestres;
    private String nivel;

    public Carrera(String nombre, int creditosTotales, int semestres, String nivel) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.semestres = semestres;
        this.nivel = nivel;
    }
}

class Estudiante extends Persona {
    private String colegioBachillerato;
    private Date fechaIngresoUniversidad;

    public Estudiante(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento,
                      String colegioBachillerato, Date fechaIngresoUniversidad) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.colegioBachillerato = colegioBachillerato;
        this.fechaIngresoUniversidad = fechaIngresoUniversidad;
    }
}

class Curso {
    private String nombre;
    private int creditos;
    private String salon;
    private String edificio;

    public Curso(String nombre, int creditos, String salon, String edificio) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
    }
}

class Universidad {
    public String nombre;
    public String nombreRector;
    public String ciudad;

    public Universidad(String nombre, String nombreRector, String ciudad) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.ciudad = ciudad;
    }
}

public class Main

