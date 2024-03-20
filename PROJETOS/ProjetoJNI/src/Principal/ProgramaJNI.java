package Principal;

public class ProgramaJNI {
    
    static 
    {
        System.loadLibrary("ProjetoJNI_Biblioteca_C");
    }
    
    private native void exibirNativo();
    
    public static void main(String[] args) {
        
        new ProgramaJNI().exibirNativo();
        
    }
    
}
