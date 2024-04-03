import java.util.Scanner;

public class Cafetera {

     private int capacidadMaxima;
     private int cantidadActual;

   //Constructor
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //Constructor vacio
    public Cafetera() {
    }

    public int llenarCafetera(){
      int restoParaCapacidadMaxima = 0;
        if (cantidadActual < capacidadMaxima){
            restoParaCapacidadMaxima = capacidadMaxima - cantidadActual;
            cantidadActual = capacidadMaxima;
        }
      return restoParaCapacidadMaxima;
    }

    public void servirTaza(int tamanoTaza){

        if (cantidadActual >= tamanoTaza){
              cantidadActual-=tamanoTaza;
              System.out.println(" Su taza se ha logrado llenar con " + tamanoTaza + " ml de Cafe ");
        }else{
            System.out.println(" Lo sentimos su Taza no se pudo llenar por falta de cafe.\n\r" +
                    " Solo se pudo servir " + cantidadActual + " ml de cafe");
            cantidadActual = 0;
        }

    }

    public void vaciarCafetera(){
        cantidadActual = 0;
    }

    public int agregarCafe( int cantidadCafeSolicitado){

        cantidadActual+=cantidadCafeSolicitado;
        int cafeSobrante = cantidadActual > capacidadMaxima ? (cantidadActual - capacidadMaxima) : 0 ;
        return cafeSobrante;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
