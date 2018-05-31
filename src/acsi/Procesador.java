package acsi;


public class Procesador 
{
    private int idProcesador;
    private String nombre;
    private int memoriaCache; 
    private int GPU;
    private int numeroNucleos;
    private int thread;
    private int voltaje;
    
    public Procesador(int idProcesador, String nombre, int memoriaCache, int GPU, int numeroNucleos, int thread, int volatje)
    {
        this.idProcesador = idProcesador;
        this.nombre = nombre;
        this.memoriaCache = memoriaCache;
        this.GPU = GPU;
        this.numeroNucleos = numeroNucleos;
        this.thread = thread;
        this.voltaje = voltaje;
    }
    
    // Getters
    
    public int getIdProcesador()
    {
        return idProcesador;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getMemoriaCache()
    {
        return memoriaCache;
    }
    
    public int getGPU()
    {
        return GPU;
    }
    
    public int getNumeroNucleos()
    {
        return numeroNucleos;
    }
    
    public int getThread()
    {
        return thread;
    }
    
    public int getVoltaje()
    {
        return voltaje;
    }
    
    // Setters
    
    public void setIdProcesador(int idProcesador)
    {
        this.idProcesador = idProcesador;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setMemoriaCache(int memoriaCache)
    {
        this.memoriaCache = memoriaCache;
    }
    
    public void setGPU(int GPU)
    {
        this.GPU = GPU;
    }
    
    public void setNumeroNucleos(int numeroNucleos)
    {
        this.numeroNucleos = numeroNucleos;
    }
    
    public void setThread(int thread)
    {
        this.thread = thread;
    }
    
    public void setVoltaje(int voltaje)
    {
        this.voltaje = voltaje;
    }
}
