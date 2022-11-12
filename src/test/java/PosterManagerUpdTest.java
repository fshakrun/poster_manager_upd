import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerUpdTest {
    @Test
    public void shouldFindLast() {
        PosterManagerUpd manager = new PosterManagerUpd();
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie4");
        manager.addMovie("Movie5");
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAll5() {
        PosterManagerUpd manager = new PosterManagerUpd(10);
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie4");
        manager.addMovie("Movie5");
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll10() {
        PosterManagerUpd manager = new PosterManagerUpd(10);
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie4");
        manager.addMovie("Movie5");
        manager.addMovie("Movie6");
        manager.addMovie("Movie7");
        manager.addMovie("Movie8");
        manager.addMovie("Movie9");
        manager.addMovie("Movie10");
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        PosterManagerUpd manager = new PosterManagerUpd();
        String[] expected = {};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

}
