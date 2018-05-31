package acsi;


public class FuenteDePoder 
{
    private  int idFuenteDePoder;
    private  String nombre;
    private  int voltaje; 
    
    public FuenteDePoder(int idFuenteDePoder, String nombre, int voltaje)
    {
        this.idFuenteDePoder = idFuenteDePoder;
        this.nombre = nombre;
        this.voltaje = voltaje;
    }
    
    // Getters
    
    public int getIdFuenteDePoder()
    {
        return idFuenteDePoder;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getVoltaje()
    {
        return voltaje;
    }
    
    // Setters
    
    public void setIdFuenteDePoder(int idFuenteDePoder)
    {
        this.idFuenteDePoder = idFuenteDePoder;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setVoltaje(int voltaje)
    {
        this.voltaje = voltaje;
    }
}
