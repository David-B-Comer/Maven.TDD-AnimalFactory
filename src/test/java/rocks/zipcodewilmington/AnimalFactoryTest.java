package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
@Test
    public void createDogTest() {
    Dog dog = new Dog("", null, 1);
}


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    public void createCatTest() {
    Cat cat = new Cat("", null, 1 );
    }
}
