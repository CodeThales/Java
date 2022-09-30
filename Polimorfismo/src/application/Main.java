package application;

import com.estudos.polimorfismo.LeiteQuente;
import com.estudos.polimorfismo.Preparador;
import com.estudos.polimorfismo.Suco;

public class Main {
    public static void main(String[] args) {

        Preparador preparador = new Preparador();

        preparador.prepararBebida(new LeiteQuente());
        System.out.println("");

        preparador.prepararBebida(new Suco());

    }
}