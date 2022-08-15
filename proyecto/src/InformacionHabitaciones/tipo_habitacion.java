package InformacionHabitaciones;

public class tipo_habitacion {
    
    private int valor_por_noche;
    private String tipo_habitacion;

    public tipo_habitacion(int _valor_por_noche, String _tipo_habitacion){

        valor_por_noche = _valor_por_noche;
        tipo_habitacion = _tipo_habitacion;
    }
    public int getValor(){
        return valor_por_noche;
    }
    public void setValor(int _valor){
        valor_por_noche = _valor;
    }
    public String getTipoHabitacion(){
        return tipo_habitacion;
    }
    public void setTipoHabitacion(String _tipo_habitacion){
        tipo_habitacion = _tipo_habitacion;
    }
}
