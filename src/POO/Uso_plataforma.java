
package POO;

public class Uso_plataforma {
    public static void main(String[] args){
        
        /* Paso 3.1) 
            
        crear o instanciar un objeto a una clase
        Clase que se usa . nombre del objeto = new nombre del constructor ();
        */
        Plataforma Renault = new Plataforma();
        Plataforma Suzuki = new Plataforma();
        
        /* Paso 4)
            Acceder a las propiedades = nombre del objeto . propiedad
                 System.out.println("Este coche tiene "+ Renault.ruedas + " ruedas");
        
            Acceder a las propuedades con private = hay que llamarlo desde el metodo creado en la otra clase
                para acceder se debe acceder por medio de un metodo setters y getters
        */
       //  Renault.ruedas=3; <------ esto no puede suceder entonces tiene que estar modularizado
       
       System.out.println(Renault.obtener_ruedas());
        
       //modificar el color de un objeto estableciendolo desde el metodo setter
       Suzuki.Establecer_color();
       
       //imprimir el color
       System.out.println(Suzuki.Obtener_color());
    }
}
