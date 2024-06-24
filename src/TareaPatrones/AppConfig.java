package TareaPatrones;



public class AppConfig {
    // Instancia única de la clase
    private static AppConfig instance;


    private int maxConexiones;
    private String serverUrl;
    private int port;



    private AppConfig() {
        // Inicialización de variables de configuración con valores por defecto
        serverUrl="localhost:8080";
        maxConexiones=10;
        port=8080;
    }

    public static AppConfig getInstance(){
        //hacer validacion
        if (instance==null){
            instance=new AppConfig();
        }
        return  instance;
    }
//metodos geters y seters
    public int getMaxConexiones() {
        return maxConexiones;
    }

    public void setMaxConexiones(int maxConexiones) {
        this.maxConexiones = maxConexiones;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
