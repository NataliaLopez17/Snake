package Resources;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by AlexVR on 7/1/2018.
 */
public class Images {


    public static BufferedImage[] Restart;
	public static BufferedImage[] butstart;
    public static BufferedImage title;
    public static BufferedImage Pause;
    public static BufferedImage gameOver;
    public static BufferedImage[] Resume;
    public static BufferedImage[] BTitle;
    public static BufferedImage[] titleButtonGameOver;
    public static ImageIcon icon;
    

    public Images() {

        butstart = new BufferedImage[2];
        Resume = new BufferedImage[2];
        BTitle = new BufferedImage[2];
        Restart = new BufferedImage[2];
        titleButtonGameOver = new BufferedImage[2];

        try {

            title = ImageIO.read(getClass().getResourceAsStream("/Buttons/900SnakeMenu.png"));
            Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/pauseScreen-0.png"));
            gameOver = ImageIO.read(getClass().getResourceAsStream("/Buttons/gameOverScreen.png"));
            Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/pausemenuresumelight.png"));
            Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/pausemenuresumedark.png"));
            BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/pausemenu titlelight.png"));
            BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/pausemenu titledark.png"));
            butstart[0]= ImageIO.read(getClass().getResourceAsStream("/Buttons/startButtonlight.png"));
            butstart[1]= ImageIO.read(getClass().getResourceAsStream("/Buttons/startButtondark.png"));
            Restart[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/gameOverRestartlight.png"));
            Restart[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/gameOverRestartdark.png"));
            titleButtonGameOver[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/gameovertitlelight.png"));
            titleButtonGameOver[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/gameovertitledark.png"));
            icon =  new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/Sheets/icon.png")));
            

        }catch (IOException e) {
        e.printStackTrace();
    }


    }

    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(Images.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
