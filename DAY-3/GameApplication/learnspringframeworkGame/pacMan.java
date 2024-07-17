package learnspringframeworkGame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacManQualifier")
public class pacMan implements GamingConsole {
    public void up(){
        System.out.println("Go Up");
    }
    public void down(){
        System.out.println("Go Down");
    }
    public void left(){
        System.out.println("Go left");
    }
    public void right(){
        System.out.println("Go right");
    }
}
