package Administracion;
import habitaciones.habitaciones;
import java.util.Scanner;

public class recepcion extends habitaciones {
    
    public static void main(String[] args){
        Scanner opcion = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa hotelero ADSO-4!");
        while(true){
            System.out.println("");
            System.out.println("¿Que desea hacer?");
            System.out.println("Revisar Disponibilidad de las habitaciones (1)");
            System.out.println("Registrar Nuevo Cliente (2)");
            System.out.println("Eliminar Cliente (3)");
            System.out.println("Cerrar el programa (4)");
            Integer entrada = opcion.nextInt();
            if(entrada == 1){
                System.out.println("Sencilla (101): "+estado101.getDisponible());
                System.out.println("Sencilla (102): "+estado102.getDisponible());
                System.out.println("Sencilla (201): "+estado201.getDisponible());
                System.out.println("Sencilla (202): "+estado202.getDisponible());
                System.out.println("Doble (301): "+estado301.getDisponible());
                System.out.println("Doble (302): "+estado302.getDisponible());
                System.out.println("Doble (303): "+estado303.getDisponible());
                System.out.println("Suite Comun (401): "+estado401.getDisponible());
                System.out.println("Suite Comun (402): "+estado402.getDisponible());
                System.out.println("Suite Presidencial (501): "+estado501.getDisponible());
                continue;
            }else if(entrada == 2){
                Scanner nuevo_cliente = new Scanner(System.in);
                while(true){
                    System.out.println("Cual habitacion desea seleccionar");
                    Integer habitacion = nuevo_cliente.nextInt();
                    if(habitacion == 101){
                        estado101.setDisponible(false);
                        System.out.println("El precio de la habitacion es de $"+tipo101.getValor());
                        break;
                    }else if(habitacion == 102){
                        estado102.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo102.getValor());
                        break;
                    }else if(habitacion == 201){
                        estado201.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo201.getValor());
                        break;
                    }else if(habitacion == 202){
                        estado202.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo202.getValor());
                        break;
                    }else if(habitacion == 301){
                        estado301.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo301.getValor());
                        break;
                    }else if(habitacion == 302){
                        estado302.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo302.getValor());
                        break;
                    }else if(habitacion == 303){
                        estado303.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo303.getValor());
                        break;
                    }else if(habitacion == 401){
                        estado401.setDisponible(false);
                        System.out.println("Habitacion registrada correctamente");
                        System.out.println("El precio de la habitacion es de $"+tipo401.getValor());
                        break;
                    }else if(habitacion == 402){
                        System.out.println("Habitacion registrada correctamente");
                        estado402.setDisponible(false);
                        System.out.println("El precio de la habitacion es de $"+tipo402.getValor());
                        break;
                    }else if(habitacion == 501){
                        System.out.println("Habitacion registrada correctamente");
                        estado501.setDisponible(false);
                        System.out.println("El precio de la habitacion es de $"+tipo501.getValor());
                        break;
                    }else{
                        System.out.println("Esa no es una opcion valida");
                        continue;
                    }
                }
            }else if(entrada == 3){
                Scanner eliminar_cliente = new Scanner(System.in);
                while(true){
                    System.out.println("Cual habitacion desea seleccionar");
                    Integer habitacion = eliminar_cliente.nextInt();
                    if(habitacion == 101){
                        estado101.setDisponible(true);
                        System.out.println("Habitacion 101 Disponible");
                        break;
                    }else if(habitacion == 102){
                        estado102.setDisponible(true);
                        System.out.println("Habitacion 102 Disponible");
                        break;
                    }else if(habitacion == 201){
                        estado201.setDisponible(true);
                        System.out.println("Habitacion 201 Disponible");
                        break;
                    }else if(habitacion == 202){
                        estado202.setDisponible(true);
                        System.out.println("Habitacion 202 Disponible");
                        break;
                    }else if(habitacion == 301){
                        estado301.setDisponible(true);
                        System.out.println("Habitacion 301 Disponible");
                        break;
                    }else if(habitacion == 302){
                        estado302.setDisponible(true);
                        System.out.println("Habitacion 302 Disponible");
                        break;
                    }else if(habitacion == 303){
                        estado303.setDisponible(true);
                        System.out.println("Habitacion 303 Disponible");
                        break;
                    }else if(habitacion == 401){
                        estado401.setDisponible(true);
                        System.out.println("Habitacion 401 Disponible");
                        break;
                    }else if(habitacion == 402){
                        estado402.setDisponible(true);
                       System.out.println("Habitacion 402 Disponible");
                        break;
                    }else if(habitacion == 501){
                        estado501.setDisponible(true);
                        System.out.println("Habitacion 501 Disponible");
                        break;
                    }else{
                        System.out.println("Esa no es una opcion valida");
                        continue;
                    }
                }
            }else if(entrada == 4){
                break;
            }else{
                System.out.println("Esa no es una opcion valida, por favor intente de nuevo");
                continue;
            }
        }
    }
}
