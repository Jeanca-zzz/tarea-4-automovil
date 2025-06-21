package claseautomovil;


public class CLaseAutomovil {

  
    public static void main(String[] args) {
         Auto miAuto = new Auto(
            "Toyota", 2022, 2.0, Auto.TipoCombustible.GASOLINA,
            Auto.TipoAutomovil.COMPACTO, 4, 5, 180,
            Auto.Color.ROJO, 0
        );

        miAuto.setVelocidadActual(100);
        System.out.println("Velocidad despues de set a 100: " + miAuto.getVelocidadActual());

        miAuto.acelerar(20);
        System.out.println("Velocidad despues de acelerar 20: " + miAuto.getVelocidadActual());

        miAuto.desacelerar(50);
        System.out.println("Velocidad despues de desacelerar 50: " + miAuto.getVelocidadActual());

        miAuto.frenar();
        System.out.println("Velocidad despues de frenar: " + miAuto.getVelocidadActual());

        System.out.println("\nDatos del automovil:");
        miAuto.mostrarDatos();
    }
    
}
