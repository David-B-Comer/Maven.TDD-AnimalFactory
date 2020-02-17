package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        Integer expectedDogs = 2;
        DogHouse.add(new Dog("",new Date(), 1));
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs, actualDogs);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        Integer givenId = 1;
        Dog dog = new Dog("", new Date(), givenId);
        DogHouse.add(dog);
        DogHouse.remove(givenId);
        Assert.assertNull(DogHouse.getDogById(givenId));
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        Integer givenId = 1;
        Dog expectedDog = new Dog("", new Date(), givenId);
        DogHouse.add(expectedDog);
        DogHouse.remove(expectedDog);
        Assert.assertNull(DogHouse.getDogById(givenId));
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        Integer givenId =1;
        Dog expectedDog = new Dog("", new Date(), givenId);
        DogHouse.clear();
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(givenId);
        Assert.assertEquals(expectedDog, actualDog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {
        Integer expectedDogs = 1;
        DogHouse.clear();
        DogHouse.add(new Dog("", new Date(), 2));
        DogHouse.remove(expectedDogs);
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs, actualDogs);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
