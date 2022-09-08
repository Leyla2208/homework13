package homework13.services;
import homework13.console.Console;
import homework13.console.SystemConsole;
public class Main {
    public static void main(String[] args) throws Exception {
        Console console = new SystemConsole();
        Core app = new Core(console);
        app.run();
    }
}
