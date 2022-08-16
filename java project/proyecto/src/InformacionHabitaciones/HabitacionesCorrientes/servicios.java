package InformacionHabitaciones.HabitacionesCorrientes;

public class servicios {

    private boolean aparcamiento;
    private boolean internet;
    private boolean lavanderia;

    public servicios(boolean _aparcamiento, boolean _internet, boolean _lavanderia){
        aparcamiento = _aparcamiento;
        internet = _internet;
        lavanderia = _lavanderia;
    }
    public String getServicios(){
        if(aparcamiento == true&&internet==true&&lavanderia==true){
            return "Tiene Aparcamiento\nTiene Internet\nTiene Acceso a la lavanderia";
        }else if(aparcamiento==true&&internet==true){
            return "Tiene Aparcamiento\nTiene Internet";
        }else if(aparcamiento == true&&lavanderia==true){
            return "Tiene Aparcamiento\nTiene Acceso a la lavanderia";
        }else if(lavanderia==true&&internet ==true){
            return "Tiene Internet\nTiene Acceso a la lavanderia";
        }else if(lavanderia==true){
            return "Tiene Acceso a la lavanderia";
        }else if(internet==true){
            return "Tiene Internet";
        }else{
            return "Tiene Aparcamiento";
        }
    }
    
}
