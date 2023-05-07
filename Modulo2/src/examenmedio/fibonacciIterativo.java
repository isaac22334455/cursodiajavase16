package examenmedio;

public class fibonacciIterativo 
{
	 
	 public static void main(String[] args) 
	 {
		 System.out.println("Elian Isaac Lopez Gonzalez 1983724 Lenguajes de Programacion");
		        int serie = 10, num1 = 0, num2 = 1, suma = 1;
		 
		        
		        System.out.println(num1);
		         
		        for (int i = 1; i < serie; i++) 
		        { 
		            System.out.println(suma);
		            suma = num1 + num2;
		            num1 = num2;
		            num2 = suma;
    
		        }
	}
 
}
