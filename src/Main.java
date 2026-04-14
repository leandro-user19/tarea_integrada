//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    Vendedor p1 = new Vendedor();
    System.out.println("Ingrese su nombre: ");
    p1.nombre = sc.nextLine();
    p1.imprimir();


    System.out.println("Ingrese su area: ");
    p1.area = sc.nextLine();
    p1.imprimir();

    System.out.println("Ingrese su monto vendido: ");
    p1.setMontovendido(sc.nextDouble());
    p1.imprimir();

    System.out.println("El valor de comision es: ");
    p1.setComision(sc.nextDouble());
    p1.imprimir();

    System.out.println("Ingrese su meta cumplida: ");
    p1.setCumplimiento(sc.nextDouble());
    p1.imprimir();





}
