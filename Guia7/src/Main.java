import models.Alumno;
import models.Colegio;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //juego();

        Colegio utn = new Colegio();

        Alumno a = new Alumno("Nicolas");
        Alumno b = new Alumno("Facundo");
        Alumno c = new Alumno("Diego");
        Alumno d = new Alumno("Mauricio");
        Alumno e = new Alumno("Lucas");

        utn.agregarAlumno(a,"Argentino");
        utn.agregarAlumno(b,"Aleman");
        utn.agregarAlumno(c,"Frances");
        utn.agregarAlumno(d,"Argentino");
        utn.agregarAlumno(e,"Argentino");

        utn.verNacionalidad("Uruguayo");

        utn.cuantos();

    }

    public static void juego() throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(1, 500);
        int x = 0;
        int i = 1;
        String exit = null;

        try {

            do {
                System.out.println("Introduce un Numero:");
                x = scan.nextInt();


                if (x < n) {
                    System.out.println("Bajo");
                } else if (x > n) {
                    System.out.println("Alto");
                } else {
                    System.out.println("Ganaste, lo intentaste " + i + " veces.");
                }
                i++;

            }while(i<10 && n!=x);

            System.out.println("Perdiste");

        }catch (InputMismatchException e){
            System.out.println("Ingrese un numero!!!");
        }finally {
            scan.close();
        }
        }
    }








