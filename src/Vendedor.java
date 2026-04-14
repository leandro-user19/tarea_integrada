public class Vendedor {

    public String nombre;
    public String area;
    private double montovendido;
    private double comision;
    private double cumplimiento;


    public Vendedor(){

    }

    public void setComision(double comision) {
        this.comision = comision;
        comision = montovendido*8/100;
    }

    public void setCumplimiento(double cumplimiento){
        if (cumplimiento>=90){
            System.out.println("Excelente");
        }else if (cumplimiento>=70){
            System.out.println("Aceptable");
        }else if (cumplimiento<70){
            System.out.println("Bajo");
        }
    }


    public void setMontovendido(double montovendido){
        this.montovendido = montovendido;
        this.montovendido += comision;

    }

    public double getComision() {
        return comision;
    }

    public double getMontovendido() {
        return comision;
    }

    public void imprimir (){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Area: "+ area);
        System.out.println("Monto vendido: "+montovendido);
        System.out.println("Comision: "+ this.comision);
        System.out.println("Meta cumplida: "+ this.cumplimiento);
        System.out.println("=====================");

    }
}
