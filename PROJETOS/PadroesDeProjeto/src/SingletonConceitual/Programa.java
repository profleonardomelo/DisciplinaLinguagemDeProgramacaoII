package SingletonConceitual;

public class Programa {

    public static void main(String[] args) {
      
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("s1 e s2 sao a mesma instancia.");
        } else {
            System.out.println("s1 e s2 sao instâncias diferentes.");
        }
    }
}
