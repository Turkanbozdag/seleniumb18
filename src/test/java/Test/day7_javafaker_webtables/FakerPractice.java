package Test.day7_javafaker_webtables;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerPractice {
    ///public static void main(String[] args) {
//Faker faker = new Faker();
//
//String name = faker.name().fullName(); // Miss Samanta Schmidt
//String firstName = faker.name().firstName(); // Emory
//String lastName = faker.name().lastName(); // Barton
//
//String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        @Test
    public void faker_test(){
            Faker faker=new Faker();


            String name = faker.name().fullName(); // Miss Samanta Schmidt
            System.out.println("name= "+name);

            String firstName = faker.name().firstName(); // Emory
            System.out.println("firstname= "+firstName);

            String lastName = faker.name().lastName(); // Barton
            System.out.println("lastName "+lastName);

            String streetAddress=faker.address().streetAddress();
            System.out.println(" streetAddress "+streetAddress);
           // String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        String gameOfThrones=faker.gameOfThrones().quote();
            System.out.println("gameOfThrones ="+gameOfThrones);

            String chuckNorris=faker.chuckNorris().fact();
            System.out.println("chuckNorris ="+chuckNorris);

        }



    }






