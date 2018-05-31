package acsi;

import java.util.ArrayList;


public class Sistema 
{
    private ArrayList<Usuario> user;
    private ArrayList<Computador> computadores;
    private ArrayList<Programa> programas;
    private Componentes partesComputador;
    
    // Constructor
    
    public Sistema (Componentes partesComputador)
    {
        user = new ArrayList<Usuario>;
        computadores = new ArrayList<Computador>;
        programas = new ArrayList<Programa>;
        this.partesComputador = partesComputador;
    }
    
    // Getters
    
    public int getUsuariosSize()
    {
        return user.size();
    }
    
    public int getComputadoresSize()
    {
        return computadores.size();
    }
    
    public int getProgramasSize()
    {
        return programas.size();
    }
    
    public Componentes getComponentes()
    {
        return partesComputador;
    }
    
    // Setters
    
    public void setUser(Usuario nuevo)
    {
        user.add(nuevo);
    }
    
    public void setComputador(Computador nuevo)
    {
        computadores.add(nuevo);
    }
    
    public void setPrograma(Programa nuevo)
    {
        programas.add(nuevo);
    }
    
    public void setComponentes(Componentes partesComputador)
    {
        this.partesComputador = partesComputador;
    }
}
