package B2;

public class Trabajo2 {

    public Trabajo2(String marca, int memoriaRam){
    this.marca=marca;
    this.memoriaRam = memoriaRam;
    }
    private String marca;
    private String procesador;
    private int Mpcamara;
    private int display;
    private int CapacidadBateria;
    private int memoriaRam;
    private boolean bluetooth;
    private boolean lectorDeHuella;
    private int Bateria;
    private boolean wifi;

    private void encenderse(){
        System.out.println("Encendido");
    }

    private void tomarFoto(){
        System.out.println("Tomar foto");
    }
    private void AumentarVolumen(){
        System.out.println("Aumentar volumen");
    }

    public int getmemoriaRam(){
        return memoriaRam;
    }
    public String getmarca(){
        return marca;
    }
    public void setmemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }
}
