/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lukuvinkkikirjasto;

import lukuvinkkikirjasto.ui.IO;
import lukuvinkkikirjasto.ui.SystemIO;
import lukuvinkkikirjasto.ui.UserInterface;
import lukuvinkkikirjasto.domain.ReadingTipService;

public class Main {
    public static void main(String[] args) {
        IO systemIO = new SystemIO();
        ReadingTipService rtService = new ReadingTipService();
        UserInterface ui = new UserInterface(systemIO, rtService);
        ui.start();
    }
}
