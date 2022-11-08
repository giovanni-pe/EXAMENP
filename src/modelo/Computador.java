package modelo;

/**
 *
 */
public class Computador {

    String Marca, Procesador, Id,numeroPuertos;

    public Computador(String Id,String Marca, String Procesador,  String numeroPuertos) {
        this.Marca = Marca;
        this.Procesador = Procesador;
        this.Id = Id;
        this.numeroPuertos = numeroPuertos;
    }

    String informacion() {
        return "["+this.Id + ":" + this.Marca + ":" + this.Procesador+this.numeroPuertos+"]";
    }

    String dato() {
        return this.Id + "," + this.Marca + "," + this.Procesador+","+this.numeroPuertos;
    }

}
