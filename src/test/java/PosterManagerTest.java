import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo);

    Poster afisha1 = new Poster(0, "Bloodshot", "action movie");
    Poster afisha2 = new Poster(1, "Forward", "cartoon");
    Poster afisha3 = new Poster(2, "Hotel Belgrade", "comedy");
    Poster afisha4 = new Poster(3, "Gentlemen", "action movie");
    Poster afisha5 = new Poster(4, "Invisible Man", "horror");
    Poster afisha6 = new Poster(5, "Trolls World Tour", "cartoon");
    Poster afisha7 = new Poster(6, "Number one", "comedy");

    @BeforeEach
    public void setup() {
        manager.add(afisha1);
        manager.add(afisha2);
        manager.add(afisha3);
        manager.add(afisha4);
        manager.add(afisha5);
        manager.add(afisha6);
        manager.add(afisha7);
    }

    @Test

    public void shouldReverseAllAfishes() {

        Poster[] expected = {afisha7, afisha6, afisha5, afisha4, afisha3, afisha2, afisha1};
        Poster[] actual = manager.getAfishes();
        Assertions.assertArrayEquals(expected, actual);
    }
}
