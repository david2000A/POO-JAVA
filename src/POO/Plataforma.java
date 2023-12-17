
package POO;


public class Plataforma { // la plataforma es la clase: caracteristicas comunes de un grupo de objetos
     
    /*Paso 1)
    especificar las caracteristicas comunes de esa plataforma*/
    
    int ruedas;
    int largo;
    int ancho;
    int motor;
    int peso;
    

    /*Paso 2)
    especificar los valores de las caracteristicas creando un metodo constructor metodo constructor es el que se encarga de dar un estado inicial
    el metodo constructor tiene el msimo nombre de la clase*/ 
    
    public Plataforma(){
        ruedas=4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    /*Paso 3) crear la clase principal donde se usa esta clase*/
}

