package football.footballplayer.distance;

import football.footballplayer.member.Player;

public interface Distance {

    void join(Player player);

    Player findByName(Player player);

    RunDistance getTotalDistanceRun();

    RunDistance getMaxDistanceRun();

}
