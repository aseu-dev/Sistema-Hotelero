package registro_habitaciones;
import InformacionHabitaciones.HabitacionesCorrientes.equipamiento_habitacion;
import InformacionHabitaciones.HabitacionesCorrientes.estado_habitacion;
import InformacionHabitaciones.HabitacionesCorrientes.servicios;
import InformacionHabitaciones.HabitacionesCorrientes.tipo_habitacion;
import InformacionHabitaciones.SuitePresidencial.equipamiento_suite_presidencial;
import InformacionHabitaciones.SuitePresidencial.servicios_suite_presidencial;

public class habitaciones {
    // Piso 1
    // Habitacion 101
    protected static tipo_habitacion tipo101 = new tipo_habitacion(25, "Sencilla");
    protected static estado_habitacion estado101 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento101 = new equipamiento_habitacion(false, true, false);
    protected static servicios servicio101 = new servicios(false, false, true);
    // Habitacion 102
    protected static tipo_habitacion tipo102 = new tipo_habitacion(25, "Sencilla");
    protected static estado_habitacion estado102 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento102 = new equipamiento_habitacion(false, true, false);
    protected static servicios servicio102 = new servicios(false, false, true);

    // Piso 2
    // Habitacion 201
    protected static tipo_habitacion tipo201 = new tipo_habitacion(25, "Sencilla");
    protected static estado_habitacion estado201 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento201 = new equipamiento_habitacion(false, true, false);
    protected static servicios servicio201 = new servicios(false, false, true);
    // Habitacion 202
    protected static tipo_habitacion tipo202 = new tipo_habitacion(25, "Sencilla");
    protected static estado_habitacion estado202 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento202 = new equipamiento_habitacion(false, true, false);
    protected static servicios servicio202 = new servicios(false, false, true); 

    // Piso 3
    //Habitacion 301
    protected static tipo_habitacion tipo301 = new tipo_habitacion(45, "Doble");
    protected static estado_habitacion estado301 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento301 = new equipamiento_habitacion(true, true, false);
    protected static servicios servicio301 = new servicios(false, true, true);
    // Habitacion 302
    protected static tipo_habitacion tipo302 = new tipo_habitacion(45, "Doble");
    protected static estado_habitacion estado302 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento302 = new equipamiento_habitacion(true, true, false);
    protected static servicios servicio302 = new servicios(false, true, true);
    // Habitacion 303
    protected static tipo_habitacion tipo303 = new tipo_habitacion(45, "Doble");
    protected static estado_habitacion estado303 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento303 = new equipamiento_habitacion(true, true, false);
    protected static servicios servicio303 = new servicios(false, true, true);

    // Piso 4 
    // Habitacion 401
    protected static tipo_habitacion tipo401 = new tipo_habitacion(56, "Suite Comun");
    protected static estado_habitacion estado401 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento401 = new equipamiento_habitacion(true, true, true);
    protected static servicios servicio401 = new servicios(true, true, true);
    // Habitacion 402
    protected static tipo_habitacion tipo402 = new tipo_habitacion(56, "Suite Comun");
    protected static estado_habitacion estado402 = new estado_habitacion(true, false);
    protected static equipamiento_habitacion equipamiento402 = new equipamiento_habitacion(true, true, true);
    protected static servicios servicio402 = new servicios(true, true, true);

    // Piso 5
    // Habitacion 501
    protected static tipo_habitacion tipo501 = new tipo_habitacion(200, "Suite Precidencial");
    protected static estado_habitacion estado501 = new estado_habitacion(true, false);
    protected static equipamiento_suite_presidencial equipamiento501 = new equipamiento_suite_presidencial(true, true, true, true);
    protected static servicios_suite_presidencial servicio501 = new servicios_suite_presidencial(true, true, true, true);
}