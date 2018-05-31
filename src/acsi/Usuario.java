package acsi;


public class Usuario 
{
    private int idUsuario;
    private String nombre;
    private String password;
    private Computador computadorUsuario;
    
    public Usuario(int idUsuario, String nombre, String password, Computador computadorUsuario)
    {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.password = password;
        this.computadorUsuario = computadorUsuario;
    }
    
    // Getters

    public int getIdUsuario() 
    {
        return idUsuario;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getPassword() 
    {
        return password;
    }

    public Computador getComputadorUsuario() 
    {
        return computadorUsuario;
    }
    
    // Setters

    public void setIdUsuario(int idUsuario) 
    {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public void setComputadorUsuario(Computador computadorUsuario) 
    {
        this.computadorUsuario = computadorUsuario;
    }
}
