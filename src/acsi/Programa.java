package acsi;


public class Programa 
{
    private int idPrograma;
    private String nombre;
    private MemoriaRam memoria;
    private TarjetaVideo tarjetaVideo;
    private Procesador procesador;
    private float tamaño;
    
    public Programa(int idPrograma, String nombre, MemoriaRam memoria, TarjetaVideo tarjetaVideo, Procesador procesador, float tamaño)
    {
        this.idPrograma = idPrograma;
        this.nombre = nombre;
        this.memoria = memoria;
        this.tarjetaVideo = tarjetaVideo;
        this.procesador = procesador;
        this.tamaño = tamaño;
    }
    
    // Getters
    
    public int getIdPrograma()
    {
        return idPrograma;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public MemoriaRam getMemoriaRam()
    {
        return memoria;
    }
    
    public TarjetaVideo getTarjetaVideo()
    {
        return tarjetaVideo;
    }
    
    public Procesador getProcesador()
    {
        return procesador;
    }
    
    public float getTamaño()
    {
        return tamaño;
    }
    
    // Setters
    
    public void setIdPrograma(int idPrograma)
    {
        this.idPrograma = idPrograma;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setMemoria(MemoriaRam memoria)
    {
        this.memoria = memoria;
    }
    
    public void setTarjetaVideo(TarjetaVideo tarjetaVideo)
    {
        this.tarjetaVideo = tarjetaVideo;
    }
    
    public void setProcesador(Procesador procesador)
    {
        this.procesador = procesador;
    }
    
    public void setTamaño(float tamaño)
    {
        this.tamaño = tamaño;
    }
}
