package InformacionHabitaciones;

// Abstraccion 
public class suite_precidencial extends equipamiento_habitacion {

    private boolean servicio_24h;

    public suite_precidencial(boolean _televisor, boolean _nevera, boolean _minibar, boolean _servicio24h) {
        
        super(_televisor, _nevera, _minibar);
        servicio_24h = _servicio24h;
    
    }
    
    public boolean getServicio24h(){
        return servicio_24h;
    }
}
