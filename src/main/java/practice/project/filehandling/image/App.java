package practice.project.filehandling.image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(practice.project.filehandling.text.App.class);

    public static void main(String[] args) {
        LOGGER.info("main method started with arguments: {}", (Object) args);
        ImageReading reading = new ImageReading();
        String chosenImageName = reading.getChosenImageName();
        try {
            BufferedImage bufferedImage = reading.getBufferedImage(chosenImageName);
            reading.showImage(bufferedImage);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.printf("Image with name '%s' could not be found!", chosenImageName);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
