package practice.project.filehandling.text;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextReading {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getPackage().getName());

    private final JFileChooser chooser;

    public TextReading() {
        LOGGER.info("Constructor is initializing 'JFileChooser' object with some defaults.");
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text", "txt", "doc", "java", "js", "py"));
        chooser.setAcceptAllFileFilterUsed(true);
    }

    public String getChosenFileName() {
        LOGGER.info("Dialog to prompt user to choose a file");
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

    public void processFile(String fileName) throws IOException {
        LOGGER.info("Processing file with name: {}", fileName);
        if (fileName == null) {
            System.out.println("No file provided!");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException ioException) {
            throw new IOException("Could not read file with name: " + fileName, ioException);
        }
    }

}
