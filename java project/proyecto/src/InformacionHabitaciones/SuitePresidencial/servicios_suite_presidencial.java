package InformacionHabitaciones.SuitePresidencial;

import InformacionHabitaciones.HabitacionesCorrientes.servicios;

public class servicios_suite_presidencial extends servicios{
    private boolean servicio_al_cuarto;

    public servicios_suite_presidencial(boolean _aparcamiento, boolean _internet, boolean _lavanderia, boolean _servicio_al_cuarto) {
        super(_aparcamiento, _internet, _lavanderia);
        servicio_al_cuarto = _servicio_al_cuarto;
    }
    public String getServicioPrivado(){
        if(servicio_al_cuarto==true){
            return "Tiene un mayordomo personal";
        }else{
            return "No tiene un mayordomo";
        }
    }
}
