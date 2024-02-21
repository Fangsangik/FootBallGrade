package football.footballplayer.grade;

import football.footballplayer.member.Player;
import football.footballplayer.type.Action;
import football.footballplayer.type.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static football.footballplayer.type.Action.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayAfterGradeTest {

    PlayAfterGrade playAfterGrade = new PlayAfterGrade();

    @Test
    @DisplayName("경기 후 평가")
    void testPlayerGrade(){
       Player striker = new Player("C.Ronaldo", 36, Position.ST);
       Player midfielder = new Player("Toni Kross", 32, Position.CM);
       Player defender = new Player("Ramos", 35, Position.CB);
       Player goalKeeper = new Player("Neuer", 35, Position.GK);

        assertEquals(0, playAfterGrade.grade(striker, 0));
        assertEquals(0, playAfterGrade.grade(midfielder, 0));
        assertEquals(0, playAfterGrade.grade(defender, 0));
        assertEquals(0, playAfterGrade.grade(goalKeeper, 0));
    }

    @Test
    @DisplayName("플래이에 행동 추가 테스트")
    void testPlayerActions(){
        Player player = new Player("Toni Kross", 32, Position.CM);
        player.addAction(SCORE);
        player.addAction(PASS);
        player.addAction(DEFENSE);

        assertEquals(3, player.getActions().size());
        assertEquals(true, player.getActions().contains(SCORE));
        assertEquals(true, player.getActions().contains(PASS));
        assertEquals(true, player.getActions().contains(DEFENSE));

    }
}