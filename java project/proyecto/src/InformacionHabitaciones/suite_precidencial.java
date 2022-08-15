package InformacionHabitaciones;


public class suite_precidencial extends equipamiento_habitacion {

    private boolean servicio_24h;

    public suite_precidencial(boolean _televisor, boolean _nevera, boolean _minibar, boolean _servicio24h) {
        
        super(_televisor, _nevera, _minibar);
        servicio_24h = _servicio24h;
    
    }
    
    public String getServicio24h(){
        if(servicio_24h == true){
            return "Tiene Servicio 24 horas";
        }else{
            return "No Tiene Servicio 24 horas";
        }
    }
}
