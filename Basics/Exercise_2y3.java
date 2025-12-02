import java.util.Scanner;
public class Exercise_2y3
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Cuantas calificaciones deseas ingresar?");
        int cantidad = sc.nextInt();
        
        double suma = 0;
    
        for (int i = 1; i <= cantidad; i++) {
            
            System.out.print("Ingresala calificacion " + i + ":");
            double nota = sc.nextDouble();
            suma = suma + nota; 
            
        }
        
        double promedio = suma / cantidad;
        
        System.out.println("El promedio de las calificaciones es: " + promedio);
        
        if(promedio < 51){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobo");
        }
    }  
}
