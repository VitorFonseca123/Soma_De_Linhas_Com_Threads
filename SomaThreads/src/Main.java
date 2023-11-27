
class Sincronizador extends Thread{

    static int[][] matriz = {{1,2,3},{2,2,1},{4,5,6}};
    static int indice = 0;
    public static void avança(){
        indice++;
    }
    public void run() {
        int soma = 0;
        int i = Sincronizador.indice;
        Sincronizador.avança();
        for (int j = 0; j < Sincronizador.matriz[i].length; j++){
            soma += Sincronizador.matriz[i][j];
        }
        System.out.println("Soma da linha "+i+": "+soma);
    }
}
public class Main{

    public static void main(String[] args) {
        Sincronizador threads[] = new Sincronizador[Sincronizador.matriz.length];

        for(int i = 0; i <Sincronizador.matriz.length; i++){

            threads[i] = new Sincronizador();
            threads[i].start();
        }}}
