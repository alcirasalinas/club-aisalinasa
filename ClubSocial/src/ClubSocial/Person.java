/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubSocial;

/**
 *
 * @author Alcisalin
 */
public class Person {

  private String name, lastname, birthday;
  private int Edad, sex;
 

    public Person() {
        
    }
  
    public Person(String name, String lastname, String birthday, int sex, int Edad) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.sex = sex;
        this.Edad = Edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name ){
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getbirthday() {
        return birthday;
    }

    public void setbirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getEdad() {
        return Edad;
    }
    
    public String sex() {
        if (sex==1) 
            return "Femenino";
        if (sex==2)
            return "Masculino";
        else 
            return "Ingrese nuevamente";
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public String Person() {
        
        return "Nombre= "+getName()+","
                + "Apellido= "+getLastname()+""
                + ", Fecha de nacimiento= "+getbirthday()
                +",Edad="+getEdad()
                +",Sexo="+sex();
                
    
}
}    
