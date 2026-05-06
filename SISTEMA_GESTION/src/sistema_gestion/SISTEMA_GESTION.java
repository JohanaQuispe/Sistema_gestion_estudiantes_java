/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_gestion;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author carol
 */
public class SISTEMA_GESTION {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        
        // Agregando un estudiante de ejemplo (como tú)
        listaEstudiantes.add(new Estudiante("Johana Quispe", 26, "Ingeniería de Sistemas", 20));
        
        System.out.println("--- SISTEMA DE GESTIÓN DE ESTUDIANTES ---");
        for (Estudiante e : listaEstudiantes) {
            e.mostrarInfo(); 
        }
    }  
}