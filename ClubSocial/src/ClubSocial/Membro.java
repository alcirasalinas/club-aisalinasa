package ClubSocial;

/**
 *
 * @author Alcisalin
 */
public class Membro extends Person {

    private int Numember;
    private String Emisiondate, Vencimientodate;
    
    public Membro(){
        
    }

    public Membro(int Numember, String Emisiondate, String Vencimientodate, String name, String lastname, String birthday, int sex, int Edad){
        super(name, lastname, birthday, sex, Edad);
    
        this.Numember = Numember;
        this.Emisiondate = Emisiondate;
        this.Vencimientodate = Vencimientodate;

    }

    public int getNumember() {
        return Numember;
    }

    public void setNumember(int Numember) {
        this.Numember = Numember;
    }

    public String getEmisiondate() {
        return Emisiondate;
    }

    public void setEmisiondate(String Emisiondate) {
        this.Emisiondate = Emisiondate;
    }

    public String getVencimientodate() {
        return Vencimientodate;
    }

    public void setVencimientodate(String Vencimientodate) {
        this.Vencimientodate = Vencimientodate;
    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero de Miembro: ");
        sb.append(Numember);
        sb.append("\nFecha de emisión:");
        sb.append(Emisiondate);
        sb.append("\nFecha de Vencimiento:");
        sb.append(Vencimientodate);
        return  sb.toString();
    
}
}
