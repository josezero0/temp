package es.sistemas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class to read a single line from the console.
 *
 * @author
 */
public final class Read {

    /**
     * Can't instance it.
     */
    protected Read() {

    }

    /**
     * Read a single line from the command line.
     *
     * @return String input from the user, <code>null</code> if an IOException
     * occurs.
     */
    public static final String line() {
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException ex) {
            return null;
        }
    }

}
