import java.util.List;     //Para usar las listas en java primero hay que importar estos módulos
import java.util.ArrayList;
import java.util.HashMap;  //Para usar los mapas en java primero hay que importar estos módulos
import java.util.Map;
import java.util.Scanner; //Para usar input en java primero hay que importar este módulo

public class Teoria {

    // Esto es un comentario
    
    /*Esto es
    un comentario
    en varios lineas
    */
   
            
    public static void main(String[] args) { 
        
        /*
        Public porque se puede acceder desde cualquier sitio. 
        Void porque esta funcion no va a retornar nada. (Return)
        */
        
        //Variables
        String nombre = "Mari";  
        final String constante = "Soy una constante, no puedo modificarme";
        Integer años = 23;
        Boolean casada = false;
         Double altura = 1.69; 
        
        System.out.println("Hola, mi nombre es " + nombre + ", mi edad es " + años + " años, mi estado civil es " + casada + " y mido " + altura);
        
        //Operadores
        Integer num1 = 1;
        Integer num2 = 4;
        
        Integer suma = num1 + num2; 
        Integer resta = num1 - num2;
        Integer multiplicar = num1 * num2;
        Integer dividir = num1 / num2;
        Integer resto = num1 % num2;
        
        //Operadores comparativos y lógicos (if, else if, else) (&&, ||, !)
        
        if (num1 != num2) {
            System.out.println("Son distintos");
        } else {
            System.out.println("Son iguales");
        }
        if (num1 == num2 && num1 == 1 ) {             //&& = And
            System.out.println("Son iguales y num1 es 1");
        } else if (num1 == 0){
            System.out.println("num1 es 0");
        }  
        if (num1 >= num2 || num1 == 0) {              //|| = Or
            System.out.println("Num 1 es mayor o igual que Num 2 o Num 1 es igual a 0");
        }    
        if (!(num1 <= num2)) {                        //! = Not
            System.out.println("Menor o igual");
        }    
        if (num1 > num2) {
            System.out.println("Mayor que");
        }    
        if (num1 < num2) {
            System.out.println("Menor que");
        } 
        
        //Listas (Primero hay que importar su módulo en la parte superior del proyecto)
        
        List<String> lista = new ArrayList<>();  //Arraylist() o List().Ahora la lista está limitada a solo datos strings, pero podemos no limitarla.
        lista.add("Mari");                     //Añadimos elementos a la lista
        lista.add("Murcia");        
        Integer edad = 23;
        lista.add(edad.toString());            //Como la lista solo admite strings, pasamos 23 a string con .toString()

        lista.remove(0);                    //Eliminamos un elemento indicando la posición o el nombre
        System.out.println(lista);
        System.out.println(lista.get(1));    // .get() para acceder a un elemento de la lista      
        
        //Mapas (Primero hay que importar su módulo en la parte superior del proyecto)
        
        Map<String, Integer> mapa = new HashMap<>(); //Podemos limitar la lista a los tipos de datos que queramos o no.
        mapa.put("Miguel", 25);
        mapa.put("María", 23);
        mapa.put("Pancho", 23);

        /*
        También están los sets y las tuplas. 
        Los sets son como las listas pero no tienen repetidos y los datos estan desordenados.
        Y las tuplas son como las listas pero son inmutables.
        */
        
        //Bucles/Loops/Ciclos (For y While)
        
        for (int x = 0; x < lista.size(); x ++){    //Para (x(entero) que comienza en 0, hasta que llegue al tamaño de la lista, que x vaya incrementandose en 1)
            System.out.println(lista.get(x)); 
        }
        
        
        Integer contador = 0;
        while (contador <= 8){    //Para (x(entero) que comienza en 0, hasta que llegue al tamaño de la lista, que x vaya incrementandose en 1)
            contador++;
            System.out.println("Número: " + contador);
        }
        
        //Input (Debemos importar 1 libreria en la parte superior del proyecto)
        
        Scanner lectorDeTexto = new Scanner(System.in); //Creamos la clase 'lectorDeTexto' que se encargará de leer nuestra respuesta en consola
        System.out.println("Ingresa tu nombre");
        String nombreDeUsuario = lectorDeTexto.nextLine();
        System.out.println("Hola " + nombreDeUsuario);
        lectorDeTexto.close();  //Debemos cerrar el scanner una vez finalizado el input
        
    
    //Funciones 
    //Las funciones debemos crearlas fuera de main y luego dentro de main llamar a la funcion creada en el exterior.
        
        //Llamadas a las funciones
        Teoria funciones = new Teoria();
        funciones.suma(1, 2);
        System.out.println(funciones.restaInt(4,3)); 
        restaIntStatic(8, 4);
    }

    //Creación de las funciones
    // Public no static void.  
    public void suma(int numero1, int numero2){ 
        System.out.println(numero1 + numero2);
    }
    //Public no static int. 
    public int restaInt(int numero1, int numero2){
        return numero1 - numero2;
    }  
    //Public static void. 
    public static void restaIntStatic(int numero1, int numero2){
        System.out.println(numero1 - numero2);
        
    /*
        PUBLICO     se puede acceder desde otros lugares del codigo
        PRIVADO     solo accesible desde la misma clase
        STATIC      No es necesario crear un nuevo main. Llamamos a la funcion como normalmente
        NO STATIC   Cuando debemos crear un nuevo 'main' para llamar a la funcion
        VOID        Cuando usamos print
        INT         Cuando usamos return, indicamos el tipo de dato(int, str...)
        */
    }  
    
}
