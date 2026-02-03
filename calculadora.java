import java.util.Scanner;
public class calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce el primer digito: ");
        int dato1 = sc.nextInt();
        System.out.print("introduce el segundo digito: ");
        int dato2 = sc.nextInt();
        System.out.print("introduzca que operacion quiere realizar (+ = suma|- = resta|/ = Division|* = Multiplicacion): ");
        char operacion = sc.next().charAt(0);
        long resultado = 0;
        switch (operacion) {
            case '+':
                resultado = dato1 + dato2;
                break;
            case '-':
                resultado = dato1 - dato2;
                break;
            case '*':
                resultado = dato1 * dato2;
                break;
            case '/':
                resultado = dato1 / dato2;
                break;
            default:
                System.out.println("operación no válida");
        }
        System.out.print(resultado);
        sc.close();
    }
}
