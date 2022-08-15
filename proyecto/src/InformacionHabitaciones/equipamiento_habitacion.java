package InformacionHabitaciones;
 
public class equipamiento_habitacion {
    
    private boolean televisor;
    private boolean nevera;
    private boolean minibar;

    public equipamiento_habitacion(boolean _televisor, boolean _nevera, boolean _minibar){
        
        televisor = _televisor;
        nevera = _nevera;
        minibar = _minibar;

    }
    public String getTelevisor(){
        if(televisor == true){
            return "Tiene Televisor";
        }else{
            return "No Tiene Televisor";
        }
    }
    public void setTelevisor(boolean _televisor){
        televisor  = _televisor;
    }
    public String getNevera(){
        if(nevera == true){
            return "Tiene Nevera";
        }else{
            return "No Tiene Nevera";
        }
    }
    public void setNevera(boolean _nevera){
        nevera  = _nevera;
    }
    public String getMinibar(){
        if(minibar == true){
            return "Tiene Minibar";
        }else{
            return "No Tiene Minibar";
        }
    }
    public void setMinibar(boolean _minibar){
        minibar  = _minibar;
    }
}
