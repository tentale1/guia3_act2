import java.util.Scanner;

/**
 * Programa para simular el mov de un pendulo respecto a la gravedad y longitud de la cuerda
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190908
 */

public class Pendulo{
    static Scanner teclado = new Scanner(System.in);

    private int l, g;
    private double sqrt, p;

    public Pendulo(){
        this.l = 3;
        this.g =2;
    }

    public Pendulo(int l1, int a1){
        this.l = l1;
        this.g = a1;
    }

    public int getl(){
        return this.l;
    }

    public int getg(){
        return this.g;
    }

    public void chal(int newl){
        this.l = newl;
    }

    public void chag(int newg){
        this.g = newg;
    }

    public double calp(){
        sqrt = Math.sqrt(this.g/this.l);
        p = (2 * Math.PI * sqrt);
        return p;
    }

    public void read() throws Exception{
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es la longitud del péndulo?");
        int i = teclado.nextInt();

        System.out.println("¿Cual es la aceleracion gravitacional");
        int j = teclado.nextInt();

        chal(i);
        chag(j);

    }

    public static void main(String[] arg) throws Exception{
        Pendulo p1 = new Pendulo();
        int var;
        Scanner teclado = new Scanner(System.in);
        
        do{ 
            System.out.println("Este programa encuentra el periodo de un pendulo según valores ingresados");
            System.out.println("Presione la tecla 1 para ingresar la longitud y la aceleracion gravitacional");
            System.out.println("Presione la tecla 2 para calcular el periodo según datos ingresados ");
            System.out.println("Presione la tecla 0 para cerrar el programa");
            System.out.print("Las opciones deben ser mayor que 0");
            var = teclado.nextInt();
            switch (var){
                case 1:
                p1.read();
                break;

                case 2:
                double calc = p1.calp();
                System.out.println("El periodo del péndulo es = " + calc);
                break;
            }
        } while (var != 0);
    }   
}
