/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubSocial;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alcisalin
 */
public class Metodos {

    private Scanner sc = new Scanner(System.in);    
    private int IdEmpl,Numb,edad,numem,sex, op;
    private String nomb, lastn,birth, Ingreso, Pues, emisionfec, vencimientofec;
    private boolean respuesta;
    private Employee e;
    private Membro m;
    private ArrayList<Employee> Empleados = new ArrayList<Employee>();
    private ArrayList<Membro> Miembros = new ArrayList<Membro>();
    
    public void menu() {
        while(op!=3){
        System.out.println("1: Empleado "
                    + "\n2. Miembro"
                    + "\n3. Salir");
        op=sc.nextInt();
        switch (op){
                case 1:
                    while(op!=3){
                    submenuEmp();
                    op = sc.nextInt();
                switch (op){
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    mostrarEmpleado();
                case 3:
                    System.out.println("Está en el menu principal");
                default:
                    opcionerror();
                   break;
                }
            } op=0;
                    break;
   
                case 2:
                while(op!=3){
                    submenuMiem();
                    op = sc.nextInt();
                switch(op){
                    case 1:
                        agregarMiembro();
                        break;
                    case 2:
                        mostrarMiembro();
                        break;
                    case 3:
                        System.out.println("Está en el menu principal");
                        
                    default:
                    opcionerror();
                   break;
                }
                }
                    
                break;
                case 3:
                    salir();
                    break;
                default:
                System.out.println("Por favor, escoja una de las opciones");
                break;
    }
        }
        }
    
    private void submenuEmp(){
        System.out.println("1: Registrar Empleado "
                    + "\n2. Mostrar Empleado"
                    + "\n3. Volver");
    }
    
    private void submenuMiem(){
        System.out.println("1: Registrar Miembro "
                    + "\n2. Mostrar Miembro"
                    + "\n3. Volver");
    } 
            
    private void agregarEmpleado(){
        
        System.out.println("\n Ingrese el Id Empleado:");
        IdEmpl = sc.nextInt();
        System.out.println("\n Ingrese el Nombre:");
        nomb = sc.next();
        System.out.println("\n Ingrese el Apellido:");
        lastn = sc.next();
        System.out.println("\n Ingrese el Sexo:"
                + "\n 1. Femenino"
                + "\n 2. Masculino");
        sex = sc.nextInt();
        System.out.println("\n Ingrese la Edad:");
        edad = sc.nextInt();
        System.out.println("\n Ingrese la fecha de cumpleaños:");
        birth = sc.next();
        System.out.println("\n Ingrese la fecha de Ingreso:");
        Ingreso = sc.next();
        System.out.println("\n Ingrese el Puesto:");
        Pues = sc.next();
       
        e = new Employee();
        e.setIdEmp(IdEmpl);
        e.setName(nomb);
        e.setLastname(lastn);
        e.setSex(sex);
        e.setEdad(edad);
        e.setbirthday(birth);
        e.setIngresoDate(Ingreso);
        e.setPuesto(Pues);
        Empleados.add(e);
        
        
        System.out.println("---Registro Agregado con Exito");
        
        
        
    }
    
    private void mostrarEmpleado(){
        
        if(Empleados.isEmpty()){
            System.out.println("\n No hay datos para mostrar");
            }
        else
            {
                System.out.println("\n Listado");
                for(int i =0; i<Empleados.size();i++){
                    e = Empleados.get(i);
                System.out.println("Id Empleado\n"+e.getIdEmp());
                System.out.println("Nombre\n"+e.getName());
                System.out.println("Apellido\n"+e.getLastname());
                System.out.println("Sexo\n"+e.sex());
                System.out.println("Edad\n"+e.getEdad());
                System.out.println("Fecha de Nacimiento\n"+e.getbirthday());
                System.out.println("Fecha de Ingreso\n"+e.getIngresoDate());
                System.out.println("Ingrese el Puesto\n"+e.getPuesto()+"\n");
                
            }
         }
                menu();
    }
    
    private void agregarMiembro(){
        
        System.out.println("\n Ingrese el Id Miembro:");
        numem = sc.nextInt();
        System.out.println("\n Ingrese el Nombre:");
        nomb = sc.next();
        System.out.println("\n Ingrese el Apellido:");
        lastn = sc.next();
        System.out.println("\n Ingrese el Sexo:");
        sex = sc.nextInt();
        System.out.println("\n Ingrese la Edad:");
        edad = sc.nextInt();
        System.out.println("\n Ingrese la fecha de nacimiento:");
        birth = sc.next();
        System.out.println("\n Ingrese la fecha de emisión de su membresía:");
        emisionfec= sc.next();
        System.out.println("\n Ingrese la fecha de vencimiento de su membrecía:");
        vencimientofec= sc.next();
       
        m = new Membro();
        m.setNumember(numem);
        m.setName(nomb);
        m.setLastname(lastn);
        m.setSex(sex);
        m.setEdad(edad);
        m.setbirthday(birth);
        m.setEmisiondate(emisionfec);
        m.setVencimientodate(vencimientofec);
        Miembros.add(m);
        
        
        System.out.println("---Registro de Miembro, fue agregado con éxito--");
        
        
        
    }
    
    private void mostrarMiembro(){
     
    if(Miembros.isEmpty()){
            System.out.println("\n No hay datos para mostrar");
            }
        else
            {
                System.out.println("\n Listado");
                for(int i =0; i<Miembros.size();i++){
                    m = Miembros.get(i);
                System.out.println("Id Miembro\n"+m.getNumember());
                System.out.println("Nombre\n"+m.getName());
                System.out.println("Apellido\n"+m.getLastname());
                System.out.println("Sexo\n"+m.sex());
                System.out.println("Edad\n"+m.getEdad());
                System.out.println("Fecha de Nacimiento\n"+m.getbirthday());
                System.out.println("Fecha de Emisión de su membresía\n"+m.getEmisiondate());
                System.out.println("Ingrese de Vencimiento de su membresía"+m.getVencimientodate()+"\n");
                
            }
         }
                menu();    
        
        
    }
    
            
    private void salir(){
        System.out.println("\n Usted está saliendo del programa");
        System.exit(0);
    }
    private void opcionerror(){
        System.out.println("\n Error de opción");
        menu();
    }
            
    
}
