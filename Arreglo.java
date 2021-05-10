import java.util.Scanner;

public class Arreglo {
    
    public static void main(String[] args) {
        
        String num[][]=new String [3][3];
        Scanner entra = new Scanner(System.in);
        for(int i=0; i<num.length; i++){
            System.out.println("ingrese un articulo");
            for (int j=0; j<3;j++){
                num[i][j]=entra.next() + "-" + "#" + i + j;
            }                

        }

        System.out.println("se guardaron los datos");
        for(int i=0; 1<num.length; i++){
            for(int j=0;j<3;j++){
                System.out.println(num[i][j] + "|");
            }
            System.out.println();

        }

        Scanner entra2=new Scanner(System.in);
        Scanner entra3=new Scanner(System.in);
        System.out.println("Ingresa el numero de la fila del producto");
        int x=entra2.nextInt();
        System.out.println("Ingrese el numero de la columna del producto");
        int y=entra3.nextInt();

        System.out.println("El producto que selecciono es: ");
        String[] partes = num[x][y].split("-");
        String parte1 = partes[0];
        System.out.println(parte1);



    }

}