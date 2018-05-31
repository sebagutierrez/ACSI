package acsi;


public class MemoriaRam 
{
    private int idMemoriaRam;
    private String nombre;
    private int tamaño;
    private int tipoGDDR;
    private int frecuencia;
    
    public MemoriaRam(int idMemoriaRam, String nombre, int tamaño, int tipoGDDR, int frecuencia)
    {
        this.idMemoriaRam = idMemoriaRam;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.tipoGDDR = tipoGDDR;
        this.frecuencia = frecuencia;
    }
    
    // Getters
    
    public int getIdMemoriaRam()
    {
        return idMemoriaRam;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getTamaño()
    {
        return tamaño;
    }
    
    public int getTipoGDDR()
    {
        return tipoGDDR;
    }
    
    public int getFrecuencia()
    {
        return frecuencia;
    }
    
    // Setters
    
    public void setIdMemoriaRam(int idMemoriaRam)
    {
        this.idMemoriaRam = idMemoriaRam;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setTamaño(int tamaño)
    {
        this.tamaño = tamaño;
    }
    
    public void setTipoGDDR(int tipoGDDR)
    {
        this.tipoGDDR = tipoGDDR;
    }
    
    public void setFrecuencia(int frecuencia)
    {
        this.frecuencia = frecuencia;
    }
}
