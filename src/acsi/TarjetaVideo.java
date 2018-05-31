package acsi;


public class TarjetaVideo 
{
    private int idTarjetaVideo;
    private String nombre;
    private int tipoGDDR;
    private int anchoDeBanda;
    private int voltaje;
    private int capacidad;
    private int velocidadReloj;
    
    public TarjetaVideo(int idTarjetaVideo, String nombre, int tipoGDDR, int anchoDeBanda, int voltaje, int capacidad, int velocidadReloj)
    {
        this.idTarjetaVideo = idTarjetaVideo;
        this.nombre = nombre;
        this.tipoGDDR = tipoGDDR;
        this.anchoDeBanda = anchoDeBanda;
        this.voltaje = voltaje;
        this.capacidad = capacidad;
        this.velocidadReloj = velocidadReloj;
    }
    
    // Getters
    
    public int getIdTarjetaVideo()
    {
        return idTarjetaVideo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getTipoGDDR()
    {
        return tipoGDDR;
    }
    
    public int getAnchoDeBanda()
    {
        return anchoDeBanda;
    }
    
    public int getVoltaje()
    {
        return voltaje;
    }
    
    public int getCapacidad()
    {
        return capacidad;
    }
    
    public int getVelocidadReloj()
    {
        return velocidadReloj;
    }
    
    // Setters
    
    public void setIdTarjetaVideo(int idTarjetaVideo)
    {
        this.idTarjetaVideo = idTarjetaVideo;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setTipoGDDR(int tipoGDDR)
    {
        this.tipoGDDR = tipoGDDR;
    }
    
    public void setAnchoDeBanda(int anchoDeBanda)
    {
        this.anchoDeBanda = anchoDeBanda;
    }
    
    public void setVoltaje(int voltaje)
    {
        this.voltaje = voltaje;
    }
            
    public void setCapacidad(int capacidad)
    {
        this.capacidad = capacidad;
    }
    
    public void setVelocidadReloj(int velocidadReloj)
    {
        this.velocidadReloj = velocidadReloj;
    }
}
