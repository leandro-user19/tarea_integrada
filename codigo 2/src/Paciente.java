public class Paciente {

    public String nombre;
    public int cedula;
    private String tiposeguro;
    public int edad;
    private double costo;
    private int consultasRealizadas;
    private int prioridad;

    public void setTiposeguro(String tiposeguro) {
        this.tiposeguro = tiposeguro;
    }


    public void setEdad(int edad){
        if (edad>0){
            this.edad=edad;

        }else{
            System.out.println("Edad no valida");
        }
    }

    public void setCosto(double costo){
        if (costo >0){
            this.costo = costo;
        }else{
            System.out.println("Costo no valido");
        }
    }

    public void setConsultasRealizadas(int consultasRealizadas){
        if (consultasRealizadas>0){
            this.consultasRealizadas = consultasRealizadas;
        }else{
            System.out.println("Numero no valido");
        }
    }

    public void setPrioridad(int prioridad){
        if (prioridad >= 1 && prioridad<=5){
            this.prioridad = prioridad;
        }else{
            System.out.println("Prioridad no valida");
        }
    }

    public double costoparcial() {
        return costo * consultasRealizadas;
    }

    public double descuento() {
        if (tiposeguro.equals("basico")) {
            return costoparcial() - (costoparcial() * 0.10);
        } else if (tiposeguro.equals("premium")) {
            return costoparcial() - (costoparcial() * 0.20);
        } else if (tiposeguro.equals("sin seguro")) ;
        return costoparcial();
    }

    public String clasificar() {
        if (prioridad == 4 || prioridad == 5) {
            return "Alta prioridad";
        } else if (prioridad == 2 || prioridad == 3) {
            return "Prioridad media";
        } else if (prioridad == 1) {
            return "Prioridad baja";
        }
        return "";
    }

    public String mensaje() {
        if (prioridad == 4 || prioridad == 5) {
            return "Atención inmediata";
        } else if (prioridad == 2 || prioridad == 3) {
            return "Seguimiento necesario";
        } else if (prioridad == 1) {
            return "Control regular";
        }
        return "";
    }

    public void imprimir(){

        System.out.println("Costo total: "+costoparcial() );
        System.out.println("Costo con descuento: "+descuento());
        System.out.println("Su prioridad es: "+);

    }


}
