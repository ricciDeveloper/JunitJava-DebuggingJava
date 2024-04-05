package one.digitalinnovation;
public class Sum {
    private int n1;
    private int n2;

    public Sum(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int somaNumeros(){
        int resultado = n1+n2;
        return resultado;
    }
}
