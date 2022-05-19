public class App {
    public static void main(String[] args) throws Exception {
        
        DVD_Player Player = new DVD_Player();

        DVD_midia DVD = new DVD_midia("Matrix");

        Player.apresentação(DVD);
    }
}
