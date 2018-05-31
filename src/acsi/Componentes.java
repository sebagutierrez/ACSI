package acsi;

import java.util.ArrayList;


public class Componentes 
{
    private ArrayList<Procesador> procesadores;
    private ArrayList<MemoriaRam> memoriasRam;
    private ArrayList<TarjetaVideo> tarjetasDeVideo;
    private ArrayList<FuenteDePoder> fuentesPoder;
    private ArrayList<DiscoDuro> disco;
    
    // Constructor
    
    public Componentes()
    {
        procesadores = new ArrayList<Procesador>;
        memoriasRam = new ArrayList<MemoriasRam>;
        tarjetasDeVideo = new ArrayList<TarjetaVideo>;
        fuentesPoder = new ArrayList<FuenteDePoder>;
        disco = new ArrayList<DiscoDuro>;
    }
    
    // Getters
    
    public int getProcesadoresSize()
    {
        return procesadores.size();
    }
    
    public int getMemoriasRamSize()
    {
        return memoriasRam.size();
    }
    
    public int getTarjetasDeVideoSize()
    {
        return tarjetasDeVideo.size();
    }
    
    public int getFuentesDePoderSize()
    {
        return fuentesPoder.size();
    }
    
    public int getDiscoDuroSize()
    {
        return disco.size();
    }
    
    // Setters
    
    public void setProcesador(Procesador nuevo)
    {
        procesadores.add(nuevo);
    }
    
    public void setMemoriaRam(MemoriaRam nuevo)
    {
        memoriasRam.add(nuevo);
    }
    
    public void setTarjetaDeVideo(TarjetaVideo nuevo)
    {
        tarjetasDeVideo.add(nuevo);
    }
    
    public void setFuenteDePoder(FuenteDePoder nuevo)
    {
        fuentesPoder.add(nuevo);
    }
    
    public void setDiscoDuro(DiscoDuro nuevo)
    {
        disco.add(nuevo);
    }
}
