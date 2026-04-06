package co.edu.poli.contexto3.vista;
import java.util.Scanner;

import co.edu.poli.contexto3.modelo.*;
import co.edu.poli.contexto3.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.contexto3.servicios.Quimico;

public class Principal {
    public static void main(String[] args) {
        System.out.println("------ PUNTO 3: SOBRECARGA Y SOBREESCRITURA ------");

        Cientifico c1 = new Cientifico();
        Cientifico c2 = new Cientifico("Ana", "C01", "F");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Quimico q1 = new Quimico("Luis", "Q01", "M");
        q1.setEspecializacion("Quimica espacial");
        System.out.println(q1.toString());
        System.out.println("\n------ PUNTO 4: ATRIBUTO STATIC ------");

        Cientifico.setSueldo(5000);
        Cientifico cientifico1 = new Cientifico("Carlos", "C02", "M");
        Cientifico cientifico2 = new Cientifico("Maria", "C03", "F");
        System.out.println("Sueldo cientifico1: " + Cientifico.getSueldo());
        System.out.println("Sueldo cientifico2: " + Cientifico.getSueldo());

        Quimico.setUniforme("Blanco");
        Quimico q2 = new Quimico("Ana", "Q02", "F");
        System.out.println(q2);
        System.out.println("Uniforme quimico1: " + Quimico.getUniforme());
        System.out.println("Uniforme quimico2: " + Quimico.getUniforme());
        System.out.println("\n------ PUNTO 5: CREACIÓN DE OBJETOS (REGISTRO)");

        Muestra muestra1 = new Muestra("M01", "Roca lunar");
        Muestra muestra2 = new Muestra("M02", "Polvo marciano");
        System.out.println(muestra1.toString());
        System.out.println(muestra2.toString());
        // ARREGLO
        System.out.println("ARREGLO");
        Persona[] personaa = new Persona[5];
        personaa[0] = new Cientifico("carlos", "c01", "F");
        personaa[1] = new Quimico("ana", "Q02", "F");
        personaa[2] = new Astronauta("Juan", "J01", "F");
        personaa[3] = new Cientifico("Maria", "C03", "F");
        personaa[4] = new Quimico("Luis", "Q01", "M");
        for (Persona p : personaa) {
            if (p != null) {
              //  System.out.println(p.toString());
               // System.out.println("Resultado operacion: " + p.operacion(10));

            }
        }
        mostrarPersona(new Cientifico("Maria", "C03", "f"));
        Persona nueva = crearPersona();
      //  System.out.println("Persona creada; " + nueva);
 
//System.out.println("\n------ PRUEBA CRUD ------");

//ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

// CREAR
//crud.crear(new Cientifico("Carlos", "C01", "M"));
//crud.crear(new Quimico("Ana", "Q01", "F"));
//crud.crear(new Cientifico("Maria", "C02", "F")); // crecimiento

// LISTAR
//crud.listar();//

// LEER
//System.out.println("Buscar C01: " + crud.leer("C01"));

// ACTUALIZAR
//crud.actualizar("Q01", new Cientifico("Pedro", "Q01", "M"));
//System.out.println("Buscar Q01 actualizado: " + crud.leer("Q01"));

// ELIMINAR
//crud.eliminar("C01");
//System.out.println("Buscar C01 eliminado: " + crud.leer("C01"));

// LISTADO FINAL
//crud.listar();
Scanner sc = new Scanner(System.in);
ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();
int opcion; 

do { 
	System.out.println("\n------ MENU -----");
	System.out.println("1. CREAR");
	System.out.println("2. LISTAR");
	System.out.println("3. ACTUALIZAR");
	System.out.println("4. ELIMINAR");
	System.out.println("5. BUSCAR");
	System.out.println("6. GUARDAR (serializar)");
	System.out.println("7. CARGAR (Deserializar)");
	System.out.println("8. SALIR");
	System.out.println("Opcion: ");
	
	opcion = sc.nextInt();
	sc.nextLine();
	
	switch(opcion){
		case 1: {
			System.out.print("ID: ");
			String id = sc.nextLine();
			
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			
			System.out.println("sexo:(M/F) ");
			String sexo = sc.nextLine();
			
			crud.crear(new Cientifico(nombre, id, sexo));
			
			break;
		}
			
		case 2: crud.listar();
		break;
		
		case 3: {
			System.out.print("Id a actualizar: ");
			String id = sc.nextLine();
			
			System.out.println("Nuevo nombre: ");
			String nombre = sc.nextLine();
			
			System.out.println("Nuevo genero: (M/F)");
			String sexo = sc.nextLine();
			
			crud.actualizar(id,  new Cientifico(nombre, id, sexo));
			
			break;
		}
		
		case 4: {
			System.out.print("ID a eliminar: ");
			String id = sc.nextLine();
			crud.eliminar(id);
			
			break;
		}
		
		case 5 : {
			System.out.print("ID  a buscar: ");
			String id = sc.nextLine();
			System.out.print(crud.leer(id));
			
			break;
		}
		
		case 6: {
			System.out.println(
					crud.serializar(crud.getPersonas(), "", "personas.dat"));
			break;
		}
		
		case 7: { 
			Persona[] datos = crud.deserializar("", "personas.dat");

        if (datos != null) {
                crud.setPersonas(datos);
            System.out.println("datos cargados completamente");
}
			
			break;
		}
		
		case 8: 
			System.out.println("saliendo...");
			break;
		
		default:
			System.out.println("opcion invalida");
			break;
	}
	
} while (opcion !=8);
sc.close();

    }

    

    public static void mostrarPersona(Persona p) {
        System.out.println("Persona recibida" + p);
    }

    public static Persona crearPersona() {
        return new Quimico("Carlos", "c01", "F");
    }


    // PUNTO 3: ATRIBUTO FINAL aplicado en la clase Persona: private final String id
    // METODO FINAL aplicado en Persona: public final void mostrarTipo()
    // CLASE FINAL aplicada en Robot: public final class Robot

    
    
}
