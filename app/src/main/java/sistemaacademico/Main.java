package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>();
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Sistema funcionando");
    }
    
public static void registrarAsignatura() {
    System.out.println("\n--- REGISTRAR ASIGNATURA ---");
    
    System.out.print("Código: ");
    String codigo = sc.nextLine();
    
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    
    System.out.print("Créditos: ");
    int creditos = sc.nextInt();
    sc.nextLine(); 
    
    Asignatura a = new Asignatura(codigo, nombre, creditos);
    asignaturas.add(a);
    
    System.out.println("Asignatura registrada correctamente.");
}

public static void listarAsignaturas() {
    System.out.println("\n--- LISTA DE ASIGNATURAS ---");
    
    if (asignaturas.isEmpty()) {
        System.out.println("No hay asignaturas registradas.");
        return;
    }
    
    for (Asignatura a : asignaturas) {
        System.out.println(a);
    }
}

public static void buscarAsignatura() {
    System.out.println("\n--- BUSCAR ASIGNATURA ---");
    
    System.out.print("Código de la asignatura: ");
    String codigo = sc.nextLine();
    
    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codigo)) {
            System.out.println("Asignatura encontrada:");
            System.out.println(a);
            return;
        }
    }
    
    System.out.println("No se encontró asignatura con código: " + codigo);
}

public static void actualizarAsignatura() {
    System.out.println("\n--- ACTUALIZAR ASIGNATURA ---");
    
    System.out.print("Código de la asignatura a actualizar: ");
    String codigo = sc.nextLine();
    
    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codigo)) {
            System.out.print("Nuevo nombre: ");
            a.setNombre(sc.nextLine());
            
            System.out.print("Nuevos créditos: ");
            a.setCreditos(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Asignatura actualizada.");
            return;
        }
    }
    
    System.out.println("No se encontró asignatura con código: " + codigo);
}

public static void eliminarAsignatura() {
    System.out.println("\n--- ELIMINAR ASIGNATURA ---");
    
    System.out.print("Código de la asignatura a eliminar: ");
    String codigo = sc.nextLine();
    
    for (int i = 0; i < asignaturas.size(); i++) {
        if (asignaturas.get(i).getCodigo().equals(codigo)) {
            asignaturas.remove(i);
            System.out.println("Asignatura eliminada.");
            return;
        }
    }
    
    System.out.println("No se encontró asignatura con código: " + codigo);
}

public static void registrarNota() {
    System.out.println("\n--- REGISTRAR NOTA ---");
    
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    
    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    
    System.out.print("Valor de la nota: ");
    double valor = sc.nextDouble();
    sc.nextLine(); 
    
    Nota nota = new Nota(codEst, codAsig, valor);
    notas.add(nota);
    
    System.out.println("Nota registrada correctamente.");
}

public static void listarNotas() {
    System.out.println("\n--- LISTA DE NOTAS ---");
    
    if (notas.isEmpty()) {
        System.out.println("No hay notas registradas.");
        return;
    }
    
    for (Nota n : notas) {
        System.out.println(n);
    }
}

public static void buscarNota() {
    System.out.println("\n--- BUSCAR NOTA ---");
    
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    
    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    
    for (Nota n : notas) {
        if (n.getCodigoEstudiante().equals(codEst) && n.getCodigoAsignatura().equals(codAsig)) {
            System.out.println("Nota encontrada:");
            System.out.println(n);
            return;
        }
    }
    
    System.out.println("No se encontró nota para ese estudiante y asignatura.");
}

public static void actualizarNota() {
    System.out.println("\n--- ACTUALIZAR NOTA ---");
    
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    
    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    
    for (Nota n : notas) {
        if (n.getCodigoEstudiante().equals(codEst) && n.getCodigoAsignatura().equals(codAsig)) {
            System.out.print("Nuevo valor de la nota: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            
            n.setValorNota(valor);
            System.out.println("Nota actualizada.");
            return;
        }
    }
    
    System.out.println("No se encontró nota para ese estudiante y asignatura.");
}
}