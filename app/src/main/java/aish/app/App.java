/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aish.app;

import aish.list.LinkedList;

import static aish.utilities.StringUtils.join;
import static aish.utilities.StringUtils.split;
import static aish.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}