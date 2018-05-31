package acsi;


public class DiscoDuro 
{
    int idDiscoDuro;
    String nombreDisco;
    float tamaño; 
    int velocidad;
    int cache; 
    
    public DiscoDuro(int id, String nombre, float tamaño, int velocidad, int cache)
    {
        idDiscoDuro = id;
        nombreDisco = nombre;
        this.tamaño = tamaño;
        this.velocidad = velocidad;
        this.cache = cache;
    }
    
    // Getters
    
    public int getIdDiscoDuro()
    {
        return idDiscoDuro;
    }
    
    public String getNombreDisco()
    {
        return nombreDisco;
    }
    
    public float getTamaño()
    {
        return tamaño;
    }
    
    public int getVelocidad()
    {
        return velocidad;
    }
    
    public int getCache()
    {
        return cache;
    }
    
    // Setters
    
    public void setIdDiscoDuro(int id)
    {
        idDiscoDuro = id;
    }
    
    public void setNombreDisco(String nombre)
    {
        nombreDisco = nombre;
    }
    
    public void setTamaño(float tamaño)
    {
        this.tamaño = tamaño;
    }
    
    public void setVelocidad(int velocidad)
    {
        this.velocidad = velocidad;
    }
    
    public void setCache(int cache)
    {
        this.cache = cache;
    }
}
