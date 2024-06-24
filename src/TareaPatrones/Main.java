package TareaPatrones;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setServerUrl("http://localhost:3000");
        System.out.println("nuvea url  " + config.getServerUrl());

        config.setPort(3000);
        System.out.println("nuvea puerto de conexion  " + config.getPort());

        config.setMaxConexiones(20);
        System.out.println("puertos maximos " + config.getMaxConexiones());


    }
}
