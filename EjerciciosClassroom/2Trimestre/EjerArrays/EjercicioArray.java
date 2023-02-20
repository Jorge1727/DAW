package EjerArrays;

public class EjercicioArray 
{    
    public static void main(String[] args) {
        
        int[] array = null;

        array = UtilesArrayJorgeTapia.rellenar(array, 10);

        UtilesArrayJorgeTapia.imprimir(array);

        array =UtilesArrayJorgeTapia.limpiar();

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 10);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 20);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 30);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 40);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 50);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 7);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 9);

        array =UtilesArrayJorgeTapia.insertarAlPrincipio(array, 98);

        array =UtilesArrayJorgeTapia.insertarAlFinal(array, 5);

        boolean ordenado = UtilesArrayJorgeTapia.estaOrdenado(array);

        System.out.println("Esta ordenado: " + ordenado);

        UtilesArrayJorgeTapia.imprimir(array);

        array =UtilesArrayJorgeTapia.eliminarPrimero(array);

        UtilesArrayJorgeTapia.imprimir(array);

        array =UtilesArrayJorgeTapia.eliminar(array, 30);

        UtilesArrayJorgeTapia.imprimir(array);

        array =UtilesArrayJorgeTapia.ordenar(array);

        UtilesArrayJorgeTapia.imprimir(array);

        array =UtilesArrayJorgeTapia.insertarOrdenado(array, 15);

        UtilesArrayJorgeTapia.imprimir(array);

        int posicion15 =UtilesArrayJorgeTapia.buscar(array, 15);

        System.out.println("El elemento 15 está en la posicion: " + posicion15);

        int posicion99 =UtilesArrayJorgeTapia.buscar(array, 99);

        System.out.println("El elemento 99 está en la posicion: " + posicion99);

        array = UtilesArrayJorgeTapia.invertir(array);

        System.out.print("Invierto el array:  ");
        UtilesArrayJorgeTapia.imprimir(array);

        array =UtilesArrayJorgeTapia.partirPor(array, 2,5);

        System.out.println("Parto el array por 2 y 5");
        UtilesArrayJorgeTapia.imprimir(array);

        int[] array2 = array;

        boolean sonIguales = UtilesArrayJorgeTapia.sonIguales(array, array2);
        System.out.println("Son iguales? : " + sonIguales);

        boolean sonIgualesEnPosicion = UtilesArrayJorgeTapia.elementosIguales(array, array2, 1);
        System.out.println("Son iguales en la posición 1? : " + sonIgualesEnPosicion);
    }
}
