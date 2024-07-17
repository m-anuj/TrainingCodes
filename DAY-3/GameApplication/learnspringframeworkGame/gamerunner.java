package learnspringframeworkGame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gamerunner {
    GamingConsole game;
    public gamerunner(@Qualifier("pacManQualifier") GamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running Game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
