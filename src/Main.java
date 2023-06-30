import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean opcionsalir;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la figura que desee calcular perimetro y area: ");
            System.out.println("a: Triangulo");
            System.out.println("b: Cuadrado");
            System.out.println("c: Circulo");
            System.out.println("d: Cubo");
            System.out.println("e: Esfera");
            System.out.println("f: Piramide");
            String input = sc.next();
            opcionsalir = true;
            switch (input) {
                case "a":
                    Triangulo tr = new Triangulo();
                    tr.ingresarPuntos();
                    System.out.println("El perimetro del triangulo es: " + tr.calcularPerimetro());
                    System.out.println("El area del triangulo es: " + tr.calcularArea());
                    break;
                case "b":
                    Cuadrado cua = new Cuadrado();
                    cua.ingresarPuntos();
                        System.out.println("El perimetro del cuadrado es: " + cua.calcularPerimetro());
                        System.out.println("El area del cuadrado es: " + cua.calcularArea());
                    break;
                case "c":
                    Circulo cr = new Circulo();
                    cr.ingresarPuntos();
                    System.out.println("El perimetro del circulo es: " + cr.calcularPerimetro());
                    System.out.println("El area del circulo es: " + cr.calcularArea());
                    break;
                case "d":
                    Cubo cu = new Cubo();
                    cu.ingresarPuntos();
                    System.out.println("El perimetro del cubo es: " + cu.calcularPerimetro());
                    System.out.println("El area del cubo es: " + cu.calcularArea());
                    break;
                case "e":
                    Esfera es = new Esfera();
                    es.ingresarPuntos();
                    System.out.println("El volumen del circulo es: " + es.calcularPerimetro());
                    System.out.println("El area del circulo es: " + es.calcularArea());
                    break;
                case "f":
                    Piramide pr = new Piramide();
                    pr.ingresarPuntos();
                    System.out.println("El volumen del Piramide es: " + pr.calcularPerimetro());
                    System.out.println("El area de la Piramide es: " + pr.calcularArea());
                    break;
                default:
                    opcionsalir = false;
                    break;
            }
        } while (opcionsalir);
    }
}