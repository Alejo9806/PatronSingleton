public class Configurador {
    private static Configurador aplicacion;

    boolean isRunning = false;
    private Configurador(){}


    public static Configurador getInstance(){
        if (aplicacion == null){
            aplicacion = new Configurador();
        }
        return aplicacion;
    }
    public  void Run(){
        if (!isRunning){
            isRunning = true;
        } else {
            System.out.println("Ya estaba en ejecucion");
        }
    }
}

