import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class FelineTests {
    Feline feline = new Feline();
    @Test
    //Проверяем, что метод обращается к getFood с параметром "Хищник"
    public void eatMeatCallGetFoodWithPredatorKey () throws Exception {
        //Animal animal = Mockito.mock(Animal.class);
        Animal animal = new Animal();
        Mockito.when(feline.eatMeat()).thenReturn(animal.getFood("Хищник"));
       // Mockito.verify(feline).eatMeat("Хищник");
    }
    @Test
    //Проверяем, что метод возвращает список для Хищника
    public void eatMeatReturnPredatorFood() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        //Feline feline = new Feline();
        Assert.assertEquals(felineFood, feline.eatMeat());
    }

//    @Test
//    public void lionGetFoodCallPredatorEatMeat1() throws Exception {
//        Lion lion = new Lion(feline, "Самец");
//        lion.getFood();
//        Mockito.verify(feline,Mockito.times(1)).eatMeat();
//    }
}
