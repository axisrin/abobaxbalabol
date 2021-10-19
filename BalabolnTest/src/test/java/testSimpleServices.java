import lesson.personal.Balabol.Meeting;
import lesson.personal.Balabol.Talking;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testSimpleServices {

    private String username1;
    private String username2;

    @Before
    public void auth() throws Exception {
        username1 = "Maxim";
        username2 = "Chasy";
    }

    @Test
    public void testGreeting() {
        String username3 = "Maxim";
        String username4 = "Chasy";

        Meeting meeting1 = new Meeting();
        Meeting meeting2 = new Meeting();

        Assert.assertEquals(meeting1.meetUser(false, username1),meeting1.meetUser(false,username3));
    }

    @Test
    public void differentsGreetings() {
        String username3 = "Maxim";
        String username4 = "Chasy";

        Meeting meeting1 = new Meeting();
        Meeting meeting2 = new Meeting();

        System.out.println(meeting1.meetUser(true, username1));
        System.out.println(meeting1.meetUser(false,username3));
        Assert.assertNotEquals(meeting1.meetUser(true, username1),meeting1.meetUser(false,username3));
    }

    @Test
    public void diffDoing() {
        String username3 = "Maxim";
        String username4 = "Chasy";

        Talking talking1 = new Talking();
        Talking talking2 = new Talking();

        System.out.println(talking1.howAreYou(1));
        System.out.println(talking1.howAreYou(2));
        System.out.println(talking1.howAreYou(10));


        Assert.assertNotEquals(talking1.howAreYou(2),talking1.howAreYou(10));
    }

}
