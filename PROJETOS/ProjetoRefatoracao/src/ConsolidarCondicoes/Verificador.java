package ConsolidarCondicoes;

public class Verificador {
    public boolean elegivel(int idade, int experiencia, boolean diploma) {
        if (idade >= 18) {
            if (experiencia >= 2) {
                if (diploma) {
                    return true;
                }
            }
        }
        return false;
    }
}
