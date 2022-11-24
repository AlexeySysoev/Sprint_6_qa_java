import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
@RunWith(Parameterized.class)
public class param {
    @Parameterized.Parameter()
    private String sex;
    @Parameterized.Parameter(1)
    private boolean expected;
   // @Mock
    Predator feline;
@Before
    public void setUp(){
    MockitoAnnotations.openMocks(this);
}
    @Parameterized.Parameters(name = "sex: {0}, expected: {1}")
public static  Object[][] params(){
    return new Object[][]{
            {"Самец", true},
            {"Самка", false}
    };

}


//public param(int one, int two){
  //  this.one = one;
   // this.two = two;
//}
@Test
    public void lionDoesHaveManeCheck() throws Exception{
    Lion lion = new Lion(feline, sex);
    //Mockito.when(feline.getKittens()).thenReturn(testData);
    //Assert.assertEquals(expected,lion.getKittens());
    Assert.assertEquals(expected, lion.doesHaveMane());
}
}

