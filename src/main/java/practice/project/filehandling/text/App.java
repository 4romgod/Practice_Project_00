package practice.project.filehandling.text;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("main method started with arguments: {}", (Object) args);
        TextReading reading = new TextReading();
        String chosenFileName = reading.getChosenFileName();
        try {
            reading.processFile(chosenFileName);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.printf("File with name '%s' could not be found!", chosenFileName);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
