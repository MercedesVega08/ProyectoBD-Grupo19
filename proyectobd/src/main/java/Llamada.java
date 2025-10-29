import java.time.*;

public class Llamada {
    
    private int nro_reclamo;
    private int nro;
    private LocalDate fecha_llamada;
    private LocalTime hora_llamada;

    public Llamada(int nro_reclamo, int nro, LocalDate fDate, LocalTime hTime){
        this.nro_reclamo = nro_reclamo;
        this.nro = nro;
        fecha_llamada = fDate;
        hora_llamada = hTime;
    }

    public int getNro(){ return nro;}

    public int getNroReclamo(){ return nro_reclamo;}

    public LocalDate getFecha(){ return fecha_llamada;}

    public LocalTime gethora(){ return hora_llamada;}

    public void setNro(int nro){ this.nro = nro;}

    public void setNroReclamo(int nro){ nro_reclamo = nro;}

    public void setFecha(LocalDate fecha){ fecha_llamada = fecha;}

    public void setHora(LocalTime hora){ hora_llamada = hora;}
}
