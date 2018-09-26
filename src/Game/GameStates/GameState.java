package Game.GameStates;

import Game.Entities.Dynamic.Player;
import Main.Handler;
import Worlds.WorldBase;
import Worlds.WorldOne;

import java.awt.*;


/**
 * Created by AlexVR on 7/1/2018.
 */
public class GameState extends State {

    private WorldBase world;

    public GameState(Handler handler){
        super(handler);
        world = new WorldOne(handler);
        handler.setWorld(world);
        handler.getWorld().player= new Player(handler);
        for (int i = 0; i < handler.getWorld().GridWidthHeightPixelCount; i++) {
            for (int j = 0; j < handler.getWorld().GridWidthHeightPixelCount; j++) {

                handler.getWorld().playerLocation[i][j]=false;
                handler.getWorld().appleLocation[i][j]=false;

            }
        }
        handler.getWorld().playerLocation[handler.getWorld().player.xCoord][handler.getWorld().player.yCoord] =true;


    }

    @Override
    public void tick() {

        handler.getWorld().tick();

    }

    @Override
    public void render(Graphics g) {
    	g.setColor(Color.BLACK);
    	g.drawRect(780, 0, 150, 780);
    	g.fillRect(780, 0, 150, 780);
    	g.setColor(Color.WHITE);
    	g.setFont(new Font("Broadway", Font.BOLD, 30)); 
    	//Add times eaten after "Score: ")
    	g.drawString("Score: ", 785, 60);

        handler.getWorld().render(g);

    }

}
