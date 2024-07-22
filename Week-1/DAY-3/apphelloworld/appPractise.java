package apphelloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class appPractise {
    public static void main(String[] args) {
        //1.Launch a spring context for spring framework to manage
        var context = new AnnotationConfigApplicationContext(helloWorldConfiguration.class);
        //2. Configure the things we want Spring to manage -
        //helloWorldConfiguration - @Configuration
        //name - @bean

        //3.Retreving the beans manged by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("personParameter"));
//        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("person5"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
