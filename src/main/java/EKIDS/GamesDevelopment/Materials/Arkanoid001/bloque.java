package EKIDS.GamesDevelopment.Materials.Arkanoid001;

public class bloque {
    public int x;
    public int y;
    public int alto;
    public int ancho;
    public boolean destruido;
   
    public bloque(int x,int y, int alto, int ancho, boolean destruido) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.destruido = destruido;
    }

}
