package InformacionHabitaciones;

// Utilizamos encapsulamiento y polimorfismo  
public class equipamiento_habitacion {
    
    private boolean televisor;
    private boolean nevera;
    private boolean minibar;

    public equipamiento_habitacion(boolean _televisor, boolean _nevera, boolean _minibar){
        
        televisor = _televisor;
        nevera = _nevera;
        minibar = _minibar;

    }
    public boolean getTelevisor(){
        return televisor;
    }
    public void setTelevisor(boolean _televisor){
        televisor  = _televisor;
    }
    public boolean getNevera(){
        return nevera;
    }
    public void setNevera(boolean _nevera){
        nevera  = _nevera;
    }
    public boolean getMinibar(){
        return minibar;
    }
    public void setMinibar(boolean _minibar){
        minibar  = _minibar;
    }
}
