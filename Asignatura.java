public class Asignatura{
    private int horas;
    private int clave;
    private String nombre;
    private int creditos;
    public Asignatura(int clave,int horas,String nombre,int creditos){
        this.clave = clave;
        this.horas = horas;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public Asignatura(String nombre,int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public int getClave(){
        return clave;
    }
    public String getnombre() {
        return nombre;
    }
    public int gethoras() {
        return horas;
    }
    public int getcreditos() {
        return creditos;
    }
    public void setClave(int clave){
        this.clave = clave;
    }
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    public void sethoras (int horas) {
        this.horas = horas;
    }
    public void setcreditos (int creditos) {
        this.creditos = creditos;
    }
}