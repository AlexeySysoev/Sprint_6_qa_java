import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    //@Mock
    Feline feline = new Feline();
    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(feline);
        String Meow = "Мяу";
        Assert.assertEquals(Meow, cat.getSound());
    }
    @Test
    public void catGetFoodCallPredatorEatMeat() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline,Mockito.times(1)).eatMeat();
    }
    @Test
    public void catGetFoodPredatorList() throws Exception {
        List<String> catFood = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);
        Assert.assertEquals(catFood, cat.getFood());
    }
}
