package InformacionHabitaciones;

public class estado_habitacion {
    
    private boolean disponible;    
    private boolean reservado;

    public estado_habitacion(boolean _disponible, boolean _reservado){

        disponible = _disponible;
        reservado = _reservado;

    }
    public String getDisponible(){
        if(disponible == true){
            return "Disponible";
        }else if(reservado == true){
            return "Reservado";
        }else{
            return "No Disponible";
        }
    }
    public void setDisponible(boolean _disponible){
        disponible  = _disponible;
    }
    public void setReservado(boolean _reservado){
        reservado = _reservado;
    }
}
