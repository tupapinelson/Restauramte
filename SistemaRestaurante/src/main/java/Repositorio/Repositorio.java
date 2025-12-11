
package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Repositorio <T> {
    private List<T> datos;

    public Repositorio() {
        this.datos = new ArrayList<>();
    }
    
    public void añadir(T elemento){
        datos.add(elemento);
    }
    
    public void eliminar(T elemento){
        datos.remove(elemento);
    }
    
    //obtener todos los elementos
    public List<T> obtenerTodos(){
        return datos;
    }
    
    //busqueda usando una expresion lambda
    public List<T> buscar(Predicate<T> filtro){
        List<T> resultados= new ArrayList<>();
        for (T elemento : datos) {
            if (filtro.test(elemento)) {
                resultados.add(elemento);
            }
        }
        return resultados;
    }
    
    public T buscarPrimero(Predicate<T> filtro){
        for (T elemento : datos) {
            if (filtro.test(elemento)) {
                return elemento;
            }
        }
        return null;
    }
    
}
