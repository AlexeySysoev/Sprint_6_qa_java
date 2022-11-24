package LionTests;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class LionGetFoodParamTest {
    @Parameterized.Parameter()
    public String lionFood;
    @Parameterized.Parameter(1)
    public boolean expected;
    Predator feline;
    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    @Parameterized.Parameters(name = "food: {0}, expected: {1}")
    public static  Object[][] params(){
        return new Object[][]{
                {"Животные", true},
                {"Птицы", true},
                {"Рыба", true},
                {"Трава", false},
                {"Различные растения", false}
        };
    }
    @Test
    public void lionGetFoodReturnRightFood() throws Exception{
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(feline, "Самка");
       Assert.assertEquals(expected, lion.getFood().contains(lionFood));
        //Assert.assertTrue(lion.getFood().contains(lionFood));
       // Assert.assertEquals(expected, lion.getFood().contains(lionFood));
        /*boolean foods = false;
        foods = lion.getFood().contains("Животные");
        System.out.println(foods);*/
    }
}