package ec.com.live.prueba1;
import java.io.IOException;
import java.util.InputMismatchException;
/**
 * Figura 11.2 División por cero
 */
import java.util.Scanner;
 
public class App {
        public static int cociente(int numerador, int denominador) throws ArithmeticException{
                return numerador/denominador;
        }
        public static void main(String[] args) {
                Scanner explorador=new Scanner(System.in);
                boolean continuarCiclo=true;
                do {
                        try{
                        System.out.print("Introduzca un numerador entero: ");
                        int numerador=explorador.nextInt();
                        System.out.print("Introduzca un denominador entero: ");
                        int denominador=explorador.nextInt();
                        int resultado=cociente(numerador, denominador);
                        System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
                        continuarCiclo=false;
                        } catch(InputMismatchException inputMismatchException){
                                System.err.printf("\nExcepcion : %s\n",inputMismatchException);
                                explorador.nextLine();
                                System.out.println("Debe introducir enteros. Intente nuevamente.\n");
                        }                      
                        catch(ArithmeticException arithmeticException){
                                /**
                                 * Excepcion lanzada cuando exista un error de tipo aritmetico como la división por cero
                                 */
                                System.err.printf("\nExcepcion : %s\n",arithmeticException);
                                System.out.println("Cero es un denominador inválido. Intente nuevamente.\n");
                        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                /**
                                 * Excepción lanzada cuando se quiera acceder mediante código a un elemento de un array
                                 * que no fue declarado.
                                 * Ejemplo: En un array de longitud 5 pretender acceder al elemento
                                 * 7 sería un error y la causa de la excepción
                                 */
                                System.err.printf("\nExcepcion : %s\n",arrayIndexOutOfBoundsException);
                        }catch (IOException ioException) {
                                /**
                                 * Excepción lanzada cuando se realiza lectura o escritura de datos y esta han fallado
                                 * Se las puede tratar con el uso de try-catch o propagar el error hacia arriba a través
                                 * de throws IOException
                                 */
                                System.err.printf("\nExcepcion : %s\n",ioException);
                        }catch (RuntimeException runtimeException) {
                                /**
                                 * Es una excepcion que la máquina virtual de java lanza en tiempo de ejecución
                                 * Ejemplo: referencia a un objeto nullo. NullPointerException
                                 */
                                System.err.printf("\nExcepcion : %s\n",runtimeException);
                        }
                } while (continuarCiclo);
                               
        }
}
