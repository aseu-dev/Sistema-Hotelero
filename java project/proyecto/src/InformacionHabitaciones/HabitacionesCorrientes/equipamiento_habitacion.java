package InformacionHabitaciones.HabitacionesCorrientes;
 
public class equipamiento_habitacion {
    
    private boolean televisor;
    private boolean nevera;
    private boolean minibar;

    public equipamiento_habitacion(boolean _televisor, boolean _nevera, boolean _minibar){
        
        televisor = _televisor;
        nevera = _nevera;
        minibar = _minibar;

    }
    public String getEquipamiento(){

        if(televisor == true && nevera==true&&minibar==true){
            return "Tiene Televisor\nTiene nevera\nTiene minibar";
        }else if(televisor==true&&nevera==true){
            return "Tiene Televisor\nTiene nevera\n";
        }else if(televisor==true&&minibar==true){
            return "Tiene Televisor\nTiene minibar";
        }else if(nevera==true&&minibar==true){
            return "Tiene nevera\nTiene minibar";
        }else if(televisor==true){
            return "Tiene televisor";
        }else if(nevera==true){
            return "Tiene nevera";
        }else{
            return "Tiene minibar";
        }
    }
    public void setTelevisor(boolean _televisor){
        televisor  = _televisor;
    }
    public void setNevera(boolean _nevera){
        nevera  = _nevera;
    }
    public void setMinibar(boolean _minibar){
        minibar  = _minibar;
    }
}
