import apis.*;
import impl.*;
import metodos.Ejercicios;

public class Main {

    public static void main(String[] args){



        GrafoTDA grafo=new GrafoLA();
        grafo.inicializarGrafo();
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);
        grafo.agregarVertice(7);
        grafo.agregarVertice(8);

        grafo.agregarArista(2,6,26);
        grafo.agregarArista(2,4,24);
        grafo.agregarArista(2,3,23);

        grafo.agregarArista(4,3,43);
        grafo.agregarArista(5,4,54);
        grafo.agregarArista(6,7,67);
        grafo.agregarArista(6,3,63);
        grafo.agregarArista(7,8,78);




        DiccionarioMultipleTDA c=Ejercicios.PesoDic(grafo);



        Ejercicios.Mostrar(c);



    }
}