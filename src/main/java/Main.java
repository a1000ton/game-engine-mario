import jade.Window;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Window window = Window.get();
        window.run();
    }
}
