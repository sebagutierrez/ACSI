package acsi;


public class Computador 
{
    private int idComputador;
    private String nombre;
    private TarjetaVideo tarjeta;
    private Procesador procesadorComputador;
    private MemoriaRam memoriaR;
    private FuenteDePoder fuenteVoltaje;
    private DiscoDuro disco;
    
    public Computador(int id, String nombre, TarjetaVideo tarjeta, Procesador procesador, MemoriaRam memoriaRam, FuenteDePoder fuente, DiscoDuro disco)
    {
        idComputador = id;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        procesadorComputador = procesador;
        memoriaR = memoriaRam;
        fuenteVoltaje = fuente;
        this.disco = disco;
    }
    
    // Getters
    
    public int getIdComputador()
    {
        return idComputador;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public TarjetaVideo getTarjetaDeVideo()
    {
        return tarjeta;
    }
    
    public Procesador getProcesador()
    {
        return procesadorComputador;
    }
    
    public MemoriaRam getMemoriaRam()
    {
        return memoriaR;
    }
    
    public FuenteDePoder getFuenteDePoder()
    {
        return fuenteVoltaje;
    }
    
    public DiscoDuro getDiscoDuro()
    {
        return disco;
    }
    
    // Setters
    
    public void setIdComputador(int id)
    {
        idComputador = id;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setTarjetaDeVideo(TarjetaVideo tarjeta)
    {
        this.tarjeta = tarjeta;
    }
    
    public void setProcesador(Procesador procesador)
    {
        procesadorComputador = procesador;
    }
    
    public void setMemoriaRam(MemoriaRam memoriaR)
    {
        this.memoriaR = memoriaR;
    }
    
    public void setFuenteDePoder(FuenteDePoder fuente)
    {
        fuenteVoltaje = fuente;
    }
    
    public void setDiscoDuro(DiscoDuro disco)
    {
        this.disco = disco;
    }
}
