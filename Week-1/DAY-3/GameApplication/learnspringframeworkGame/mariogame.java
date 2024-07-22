package learnspringframeworkGame;

import org.springframework.stereotype.Component;

@Component
public class mariogame implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go in th tunnel");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Go forward");
    }
}
