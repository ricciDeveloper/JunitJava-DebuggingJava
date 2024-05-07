import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main.");
    }
    static void a(){
        System.out.println("Entrou no médoto A.");
        b();
        System.out.println("Finalizou o método A.");
    }
    static void b(){
        System.out.println("Entrou no médoto B.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método B.");
    } static void c(){
        System.out.println("Entrou no médoto c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}