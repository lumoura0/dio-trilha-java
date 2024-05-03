public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> A TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual ? " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(44);
        System.out.println("Novo Status -> Canal Atual : " + smartTv.canal);

    }
}
