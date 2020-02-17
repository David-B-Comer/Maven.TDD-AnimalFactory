package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        Integer expectedNumberOfCats = 1;
        CatHouse.add(new Cat("", new Date(), 1));
        Integer actualNumberOfCats= CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
       Integer givenId = 1;
       Cat cat = new Cat("", new Date(), givenId);
       CatHouse.clear();
       CatHouse.add(cat);
       CatHouse.remove(givenId);
       Assert.assertNull(CatHouse.getCatById(givenId));
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        Integer givenId = 1;
        Cat cat = new Cat("", new Date(), givenId);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertNull(CatHouse.getCatById(givenId));
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        Integer givenId = 1;
        Cat expectedCat = new Cat("", new Date(), givenId);
        CatHouse.clear();
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(givenId);
        Assert.assertEquals(expectedCat, actualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        Integer expectedCats = 1;
        CatHouse.clear();
        CatHouse.add(new Cat("", new Date(), 1));
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats, actualCats);
    }
}
