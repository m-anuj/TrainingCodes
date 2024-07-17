package learnspringframework;

import learnspringframeworkGame.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("learnspringframeworkGame")
public class AppGamingBasic {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppGamingBasic.class);

        context.getBean(GamingConsole.class).up();
        context.getBean(gamerunner.class).run();

//        var game = new mariogame();
//        var game = new superContra();
//        var game = new pacMan(); // Object creation
//        var gamerunner = new gamerunner(game);//Object creation + wiring dependencies
//        game is a dependency of gamerunner
//        gamerunner.run();
    }
}
