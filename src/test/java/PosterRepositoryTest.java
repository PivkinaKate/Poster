import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    Poster afisha1 = new Poster(0, "Bloodshot", "action movie");
    Poster afisha2 = new Poster(1, "Forward", "cartoon");
    Poster afisha3 = new Poster(2, "Hotel Belgrade", "comedy");
    Poster afisha4 = new Poster(3, "Gentlemen", "action movie");
    Poster afisha5 = new Poster(4, "Invisible Man", "horror");
    Poster afisha6 = new Poster(5, "Trolls World Tour", "cartoon");
    Poster afisha7 = new Poster(6, "Number one", "comedy");


   @Test


    public void test() {
        PosterRepository repo = new PosterRepository();
        repo.save(afisha1);
        repo.save(afisha2);
        repo.save(afisha3);
        repo.save(afisha4);
        repo.save(afisha5);
        repo.save(afisha6);
        repo.save(afisha7);

        Poster[] expected = {afisha1, afisha2, afisha3, afisha4, afisha5, afisha6, afisha7};
        Poster[] actual = repo.getAfishes();

       Assertions.assertArrayEquals(expected, actual);
    }




}


