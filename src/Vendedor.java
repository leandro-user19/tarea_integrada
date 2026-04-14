public class Vendedor {

    public String nombre;
    public String area;
    private double montovendido;
    private double comision;
    private double cumplimiento;


    public Vendedor(){

    }

    public double calcularComision(){
        return montovendido * 0.08/100;
    }


    public double IngresoTotal() {
        return montovendido + calcularComision();
    }

    public String estado(){
        if (cumplimiento >= 90) return "Excelente";
        else if (cumplimiento >= 70) return "Aceptable";
        else return "Bajo";
    }
    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setCumplimiento(double cumplimiento){
        this.cumplimiento = cumplimiento;

    }

    public void setMontovendido(double montovendido){
        this.montovendido = montovendido;

    }

    public double getComision() {
        return comision;
    }

    public double getMontovendido() {
        return montovendido;
    }


    public void imprimir (){
            System.out.println("Nombre: " + nombre);
            System.out.println("Área: " + area);
            System.out.println("Monto vendido: " + montovendido);
            System.out.println("Comisión: " + calcularComision());
            System.out.println("Ingreso total: " + IngresoTotal());
            System.out.println("Estado: " + estado());
        }
    }



