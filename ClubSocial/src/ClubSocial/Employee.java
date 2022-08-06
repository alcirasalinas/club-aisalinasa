/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubSocial;

import java.util.Scanner;

/**
 *
 * @author Alcisalin
 */
public class Employee extends Person {
    
    private int IdEmp;
    private String IngresoDate,  Puesto;
    private Employee e;
    Scanner sc = new Scanner (System.in); 

    public Employee (){
        
    }
            
    public Employee(int IdEmp, String IngresoDate, String Puesto, String name, String lastname, String birthday, int sex, int Edad)
    {
        super(name, lastname, birthday, sex, Edad);
        this.IdEmp = IdEmp;
        this.IngresoDate = IngresoDate;
        this.Puesto = Puesto;
    }

  
    public int getIdEmp() {
        return IdEmp;
    }

    public void setIdEmp(int IdEmp) {
        this.IdEmp = IdEmp;
    }

    public String getIngresoDate() {
        return IngresoDate;
    }

    public void setIngresoDate(String IngresoDate) {
        this.IngresoDate = IngresoDate;
    }
    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    
    
    }
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nId empleado: ");
        sb.append(IdEmp);
        sb.append("\n:Fecha ingreso ");
        sb.append(IngresoDate);
        sb.append("\nPuesto: ");
        sb.append(Puesto);
        return  sb.toString();
    
}
}