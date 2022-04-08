
package hereciaejer1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


public class HereciaEjer1 {

    public static void main(String[] args) {

        //perro
        Animal perro = new Perro("tomty", "asado", 7, "ovejero");
        perro.AlimentarPerro(50);
        Perro perro1 = new Perro("Laqui", "alimento", 3, "fox");
        perro1.AlimentarPerro(10);

        //gato
        Animal gato = new Gato("Laqui", "alimento", 3, "fox");
        gato.AlimentarGato(34);

        //caballo
        Animal caballo = new Caballo("Laqui", "alimento", 3, "fox");
        caballo.AlimentarCaballo(10);

        gato.toString();
        caballo.toString();
        System.out.println(perro.toString());
        System.out.println(gato.toString());
        System.out.println(caballo.toString());

    }

}
