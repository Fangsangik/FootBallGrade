package football.footballplayer.grade;

import football.footballplayer.member.Player;
import football.footballplayer.type.Position;
import football.footballplayer.type.Result;

public class PlayAfterGrade implements Grade {

    private int score;
    private double pass;
    private double defense;
    private double block;

    private int gradeCnt = 0;

    @Override
    public int grade(Player player, int playedGrade) {
        switch (player.getPosition()) {
            case ST:
                if (score == 1 || pass == Result.SUCCESS.ordinal()) {
                    if (gradeCnt < 10) {
                        gradeCnt++;
                    }
                } else if (pass == Result.FAIL.ordinal()) {
                    gradeCnt = Math.max(gradeCnt - 1, 0);
                }
                break;
            case CM:
                if (score == 1 || pass == Result.SUCCESS.ordinal() || defense == Result.SUCCESS.ordinal()) {
                    if (gradeCnt < 10) {
                        gradeCnt++;
                    }
                } else if (pass == Result.FAIL.ordinal() || defense == Result.FAIL.ordinal()) {
                    gradeCnt = Math.max(gradeCnt - 1, 0);
                }
                break;
            case CB:
                if (score == 1 || pass == Result.SUCCESS.ordinal() || defense == Result.SUCCESS.ordinal()) {
                    if (gradeCnt < 10) {
                        gradeCnt += 2;
                    }
                } else if (pass == Result.FAIL.ordinal()) {
                    gradeCnt = Math.max(gradeCnt - 1, 0);
                } else if (defense == Result.FAIL.ordinal()) {
                    gradeCnt = Math.max(gradeCnt - 2, 0);
                }
                break;
            case GK:
                if (pass == Result.SUCCESS.ordinal()) {
                    if (gradeCnt < 10) {
                        gradeCnt++;
                    }
                } else {
                    gradeCnt = Math.max(gradeCnt - 1, 0);
                }
                break;
        }

        return gradeCnt;
    }
}