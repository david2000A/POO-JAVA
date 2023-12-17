
package POO;

public class Uso_plataforma {
    public static void main(String[] args){
        
        /* Paso 3.1) 
            
        crear o instanciar un objeto a una clase
        Clase que se usa . nombre del objeto = new nombre del constructor ();
        */
        Plataforma Renault = new Plataforma();
    
        /* Paso 4)
            Acceder a las propiedades = nombre del objeto . propiedad
        */
    
        System.out.println("Este coche tiene "+ Renault.ruedas + " ruedas");
        
    }
}
