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
    public static BufferedImage[] Options;
    public static BufferedImage[] titleButtonGameOver;
    public static ImageIcon icon;
    

    public Images() {

        butstart = new BufferedImage[3];
        Resume = new BufferedImage[2];
        BTitle = new BufferedImage[2];
        Options = new BufferedImage[2];
        Restart = new BufferedImage[2];
        titleButtonGameOver = new BufferedImage[2];

        try {

            title = ImageIO.read(getClass().getResourceAsStream("/Buttons/900SnakeMenu.png"));
            Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/PauseScreenNEW.png"));
            gameOver = ImageIO.read(getClass().getResourceAsStream("/Buttons/GameOverScreenNEW.png"));
            Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Resume button Pause.png"));
            Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Resume button Pause.png"));
            BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/TitlePause.png"));
            BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/TitlePause.png"));
            Options[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Options.png"));
            Options[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsP.png"));
            butstart[0]= ImageIO.read(getClass().getResourceAsStream("/Buttons/NormBut.png"));//normbut
            butstart[1]= ImageIO.read(getClass().getResourceAsStream("/Buttons/HoverBut.png"));//hoverbut
            butstart[2]= ImageIO.read(getClass().getResourceAsStream("/Buttons/ClickedBut.png"));//clickbut
            Restart[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/restart button game over.png"));
            Restart[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/restart button game over.png"));
            titleButtonGameOver[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/title button game over.png"));
            titleButtonGameOver[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/title button game over.png"));
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
