package apphelloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age,Address address){ };
record Address (String city,String country) { };
@Configuration
public class helloWorldConfiguration {

    @Bean
    public String name(){
        return "Anuj";
    }
    @Bean
    public int age(){
        return 23;
    }
    @Bean
    public Person person(){
        var person = new Person("aman",26,new Address("patna","india"));
        return person;
    }
    @Bean
    @Qualifier("addressQualifier")
    public Address address(){
        var address = new Address("Birgunj","Nepal");
        return address;
    }
    @Bean
    public Person person2(){
        return new Person(name(),age(),address());
    }
    @Bean
    public Person personParameter(String name, int age, Address address){
        return new Person(name,age,address);
    }
    @Bean
    public Person person5(String name, int age, @Qualifier("addressQualifier") Address address){
        return new Person(name,age,address);
    }

}
