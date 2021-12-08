package pacote01;

public class Projetao {

    int[] valores;

    public Projetao(int... valores) {
        this.valores = valores;
    }

    public int getSomaValores() {
        int total = 0;

        for (int x : valores) {
            total += x;
        }
        return total;
    }
}
