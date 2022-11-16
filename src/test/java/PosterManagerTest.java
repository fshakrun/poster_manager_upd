import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager();
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
    public void shouldFindLast10() {
        PosterManager manager = new PosterManager(10);
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
        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOverLimits() {
        PosterManager manager = new PosterManager(10);
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
        manager.addMovie("Movie11");
        String[] expected = {"Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll5() {
        PosterManager manager = new PosterManager(10);
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
        PosterManager manager = new PosterManager(10);
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
    public void testOverLimit() {
        PosterManager manager = new PosterManager(10);
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
        manager.addMovie("Movie11");
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10", "Movie11"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

}
