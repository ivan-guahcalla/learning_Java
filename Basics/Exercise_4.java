import java.util.Scanner;
public class Exercise_4
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int prim;
        System.out.print("""
                Bienvenido al detector de numeros Primos, que numero 
                quisieras detectar si es primo?
                """);
                int num = sc.nextInt();
        if(num <= 1){
            System.out.println("No es primo :(");
        }else{
            for(int div = 1;div <= num;div++){
                if((num % div) == 0){
                    cont++;
                }
            }
            if(cont <= 2){
                        System.out.println("Es primo :)");
            }else{
                        System.out.println("No es primo :(");
                    }
                }
            }    
        }
        

