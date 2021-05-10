public class MatrizFacil {

    
    public static void main(String[] args) {
        
        int [][] numeros; //un array multidimensional de numeros enteros
        int i, j; //para recorrer el array: i=filas, j=colas
        
        //este array tiene 2 filas y 3 columnas
        numeros = new int [2][3];
        
        for (i=0; i<numeros.length; i++){ //Recorre las filas
            for (j=0; j<numeros[i].length; j++){ //de cada fila se reccorren todas las columnas
                numeros[i][j] = 0;
                System.out.print(numeros[i][j] + " ");//se imprimen los elementos de la fila.
            }
            System.out.println("");
        }
    }
    
}

