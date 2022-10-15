import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game = new Game();
    Player player1 = new Player(1, "Robo", 33);
    Player player2 = new Player(2, "Goro", 23);
    Player player3 = new Player(3, "Goro", 33);
    Player player4 = new Player(4, "Goro", 50);

    @Test
    public void ifTheFirstPlayerIsNullTest() {

        game.register(player2);

        Assertions.assertThrows(NotFoundException.class, () -> {
            game.round(player1.getName(), player2.getName());
        });

    }

    @Test
    public void ifTheSecondPlayerIsNullTest() {

        game.register(player1);

        Assertions.assertThrows(NotFoundException.class, () -> {
            game.round(player1.getName(), player2.getName());
        });

    }

    @Test
    public void ifTheFirstPlayerIsStrongerThaTheSecondTest() {

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifTheSecondPlayerIsStrongerThaTheFirstTest() {

        game.register(player1);
        game.register(player4);

        int expected = 2;
        int actual = game.round(player1.getName(), player4.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theStrengthsOfTheFirstAndSecondPlayersAreEqualTest() {

        game.register(player1);
        game.register(player3);

        int expected = 0;
        int actual = game.round(player1.getName(), player3.getName());

        Assertions.assertEquals(expected, actual);
    }

}