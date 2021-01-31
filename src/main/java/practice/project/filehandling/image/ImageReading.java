package practice.project.filehandling.image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageReading {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getPackage().getName());

    private final JFileChooser chooser;

    public ImageReading() {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        chooser.setAcceptAllFileFilterUsed(true);
    }

    public String getChosenImageName() {
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

    public BufferedImage getBufferedImage(String imageName) throws IOException {
        LOGGER.info("Creating image with name: {}", imageName);
        if (imageName == null) {
            System.out.println("No file provided!");
            return null;
        }
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(imageName));
            return bufferedImage;
        } catch (IOException ioException) {
            throw new IOException("Could not create BufferedImage for file: " + imageName, ioException);
        }
    }

    public void showImage(BufferedImage bufferedImage) {
        LOGGER.info("showing image...");
        if (bufferedImage != null) {
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());
            frame.setSize(1200, 800);
            JLabel jLabel = new JLabel();

            ImageIcon icon = new ImageIcon(bufferedImage);
            jLabel.setIcon(icon);
            frame.add(jLabel);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            int imageWidth = bufferedImage.getWidth(null);
            int imageHeight = bufferedImage.getHeight(null);

            Graphics graphics = bufferedImage.getGraphics();
            graphics.drawImage(bufferedImage, 1200, 800, null);

            for (int i = 0; i * imageWidth <= 2; i++) {
                for (int j = 0; j * imageHeight <= 2; j++)
                    if (i + j > 0) graphics.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
            }
        }
    }

}
