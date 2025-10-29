import java.time.LocalDate;

public class Reclamo {
    
    private int id_usuario;
    private int nro;
    private int codigo;
    private LocalDate fecha;

    public Reclamo(int id, int nro, int codigo, LocalDate fecha){
        this.codigo = codigo;
        this.fecha = fecha;
        this.nro = nro;
        id_usuario = id;
    }

    public int getIdUser(){ return id_usuario;}

    public int getNro(){ return nro;}

    public int getCodigo(){ return codigo;}

    public LocalDate getFDate(){ return fecha;}

    public void setId(int id){ id_usuario = id;}

    public void setNro(int nro){ this.nro = nro;}

    public void setCodigo(int codigo){ this.codigo = codigo;}

    public void setFecha(LocalDate fecha){ this.fecha = fecha;}
}
