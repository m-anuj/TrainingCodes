package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


class YourBussiness{

    //Constructor Based
    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBussiness(Dependency1 dependency1,Dependency2 dependency2){
        this.dependency1=dependency1;
        this.dependency2=dependency2;
    }

    // Setter Based
//    Dependency1 dependency1;
//    Dependency2 dependency2;
//    @Autowired
//    public void setDependency1(Dependency1 dependency1){
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2){
//        this.dependency2 = dependency2;
//    }
    //Field injection
//    @Autowired
//    Dependency1 dependency1;
//    @Autowired
//    Dependency2 dependency2;

    public String toString(){
        return "Both dependencies are "+dependency1+" and"+dependency2;
    }

}
class Dependency1{

}
class Dependency2{

}
@Configuration
@ComponentScan
public class AppGamingBasic {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppGamingBasic.class);

        System.out.println(context.getBean(YourBussiness.class));

    }
}
