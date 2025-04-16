import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner input = new Scanner(System.in);
        int entrada;
        Perro masViejo = null;
        List<Perro> lstPerro = new ArrayList<>();
        List<Persona> lstPersona = new ArrayList<>();

        do{
        System.out.println("""
                MENU DEL PROGRAMA
                
                1. registrar una persona
                2. registrar un perro
                3. mostrar personas registradas
                4. mostrar perros disponibles
                5. adoptar un perro
                6. consultar el perro mas viejo adoptado
                7. SALIR
               
                """);
            entrada = input.nextInt();
            switch (entrada){
                case 1 -> { //registrar una persona
                    System.out.println("ingrese el nombre de la persona");
                    String nombre = input.next();
                    System.out.println("ingrese el apellido de la persona");
                    String apellido = input.next();
                    System.out.println("ingrese la edad de la persona (solo el numero) ");
                    int edad = input.nextInt();
                    System.out.println("ingrese el numero de documento");
                    String documento = input.next();
                    System.out.println("cuantos perros ha adoptado?");
                    int adopciones = input.nextInt();
                    lstPersona.add(new Persona(nombre, apellido, edad, documento, adopciones));
                }
                case 2 -> { //registrar un perro
                    System.out.println("ingrese la placa del perro");
                    String placa = input.next();
                    System.out.println("ingrese el nombre del perro");
                    String nombre = input.next();
                    System.out.println("ingrese la raza del perro");
                    String raza = input.next();
                    System.out.println("ingrese la edad del perro (solo el numero)");
                    int edad = input.nextInt();
                    System.out.println("ingrese el tamaño del perro (grande, pequeño mediano) ");
                    String size = input.next();
                    lstPerro.add(new Perro(placa, nombre, raza, size, edad));
                }
                case 3 -> { //mostrar personas registradas
                    System.out.println("personas registradas: " + lstPersona);
                }
                case 4 -> { //mostrar perros disponibles
                    if (lstPerro.isEmpty()) {
                        System.out.println("no hay perros para adoptar");
                    } else {
                        System.out.println("perros para adopcion: ");
                        for (Perro p : lstPerro) {
                            if (p.adoptado) {
                                System.out.println(p);
                            }
                        }
                    }
                }
                case 5 -> { //adoptar un perro

                    if (lstPersona.isEmpty()) {
                        System.out.println("tiene que registrar a alguien primero");
                    } else {
                        System.out.println("digite su numero de identificacion");
                        String id = input.next();
                        for (Persona p : lstPersona) {
                            if (p.getDocumento().equals(id) && p.adopciones<3) {
                                System.out.println("que perro desea adoptar? \n\tdigite su numero de placa");
                                String placa = input.next();
                                for (Perro q : lstPerro) {
                                    if (q.getPlaca().equals(placa) && q.adoptado) {
                                        System.out.println("ha adoptado al perro:  " + q);
                                        q.adoptado = false;
                                        p.adopciones+=1;
                                    } else if (q.getPlaca() != placa) {
                                        System.out.println("no se puede encontrar la placa del perro");
                                    }
                                }
                            } else if (p.adopciones>2){
                                System.out.println("ya tiene muchos perros adoptados");
                            } else {
                                System.out.println("no se pudo encontrar la persona");
                            }
                        }
                    }
                }
                case 6 -> { //consultar el perro mas viejo adoptado
                    for (Perro p : lstPerro) {
                        if (!p.adoptado){
                            if ((masViejo == null)||(p.getEdad() > masViejo.getEdad())){
                                masViejo = p;
                            }
                        }
                        System.out.println("el perro mas viejo que ha sido adoptado es: ");
                        System.out.println(masViejo);
                    }
                }
                case 7 -> { //salir
                    System.out.println("saliendo...");
                    seguir = false;
                }
            }
        }while (seguir);
    }
}