
package POO;


public class Plataforma { // la plataforma es la clase: caracteristicas comunes de un grupo de objetos
     
    /*Paso 1)
    especificar las caracteristicas comunes de esa plataforma*/
    
   private int ruedas; //private ayuda a que no se modifique desde otra clase
   private int largo;
   private int ancho;
   private int motor;
   private int peso_plataforma;
   
   //propiedades que pueden variar
   
   String color;
   int peso_total;
   boolean asientos_cuero, climatizador;

    /*Paso 2)
    especificar los valores de las caracteristicas creando un metodo constructor metodo constructor es el que se encarga de dar un estado inicial
    el metodo constructor tiene el msimo nombre de la clase*/ 
   
    /*solo desde esta clase puedo cambiar los valores de la plataforma
      eso se llama modularización para eso se necesitan los modificadores
      de acceso "private" "public" "protected"
    */
    
    public Plataforma(){
        ruedas=4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;        
        
    }

    /*Paso 3) crear la clase principal donde se usa esta clase*/
    
    
    /*Paso 4)
    la forma de comunicarse entre clases son metodos
        
    Setter = se modifica el valor de una propiedad
            public void nombre_metodo(){codigo sin return}
    Getter = obtenemos el valor de la propiedad
            public tipo_de_dato nombre_metodo(){codigo + return}
    */
    
    
    //METODOS GETTER
    
      public String obtener_ruedas(){
         
          return "El numero de ruedas del coche son: "+ruedas;
      };
    
    //METODOS SETTER
      public void Establecer_color(){
          color="Azul";
      }
    
    //METODO GETTER
      
      public String Obtener_color(){
          return "El color del coche es: "+color;
      }
}

