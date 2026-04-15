//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public static void main() {

    Scanner sc = new Scanner(System.in);

    Paciente p1 = new Paciente();

    System.out.print("Ingrese su nombre: ");
    p1.nombre = sc.nextLine();

    System.out.print("Ingrese su cedula: ");
    p1.cedula = sc.nextInt();
    sc.nextLine();


    System.out.print("Ingrese su tipo de seguro(basico/premium/sin seguro): ");
    p1.setTiposeguro(sc.nextLine());

    System.out.print("Ingrese su edad: ");
    p1.setEdad(sc.nextInt());

    System.out.print("Ingrese el costo de la consulta: ");
    p1.setCosto(sc.nextDouble());

    System.out.print("Cuantas consultas tuvo: ");
    p1.setConsultasRealizadas(sc.nextInt());

    System.out.print("Que prioridad es(1 al 5): ");
    p1.setPrioridad(sc.nextInt());
    p1.imprimir();
}
