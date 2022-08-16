package InformacionHabitaciones.SuitePresidencial;

import InformacionHabitaciones.HabitacionesCorrientes.equipamiento_habitacion;

public class equipamiento_suite_presidencial extends equipamiento_habitacion {

    private boolean piscina_privada;

    public equipamiento_suite_presidencial(boolean _televisor, boolean _nevera, boolean _minibar, boolean _piscina_privada) {
        
        super(_televisor, _nevera, _minibar);
        piscina_privada = _piscina_privada;
    
    }
    
    public String getPiscinaPrivada(){
        if(piscina_privada == true){
            return "Tiene piscina privada";
        }else{
            return "No Tiene piscina privada";
        }
    }
}
