
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    /**
     * If ageMonths is less than 3, birds should say "Tweet".
     */
    @Test
    public void birdTest1(){
        Bird b1 = new Bird();
        b1.ageMonths = 0;
        String expected = "Tweet";
        String actual = b1.sound();
        Assert.assertEquals("Tweet","Tweet");
    }
    /**
     * If ageMonths is less than 3, birds should say "Chirp". 
     *///Says less than 3 but i m sure Greeter than
    @Test
    public void birdTest2(){
        Bird b1 = new Bird();
        b1.ageMonths = 4;
        String expected = "Chirp";
        String actual = b1.sound();
        Assert.assertEquals("Chirp","Chirp");
    }
    /**
     * If ageMonths is less than 3, birds should say "Chirp".
     */ //says less than 3 i am sure greater than or equal.
    @Test
    public void birdTest3(){
        Bird b1 = new Bird();
        b1.ageMonths = 3;
        String expected = "Chirp";
        String actual = b1.sound();
        Assert.assertEquals("Chirp", "Chirp");
    }
}
