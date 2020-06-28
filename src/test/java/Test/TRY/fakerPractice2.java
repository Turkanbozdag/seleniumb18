package Test.TRY;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class fakerPractice2 {
    @Test
    public void faker_test(){
        Faker faker=new Faker();
        String name=faker.name().fullName();
        System.out.println();

        String firstname=faker.name().firstName();
        System.out.println("firstname="+firstname);

        String lastname=faker.name().lastName();
        System.out.println("lastname "+lastname);

        String streetAdress=faker.address().streetAddress();
        System.out.println("streetAddress="+streetAdress);


        String gameOfThrones=faker.gameOfThrones().quote();
        System.out.println("gameOfThrones ="+gameOfThrones);


        String chuckNorris=faker.chuckNorris().fact();
        System.out.println("chuckNorris="+chuckNorris);


    }






}
