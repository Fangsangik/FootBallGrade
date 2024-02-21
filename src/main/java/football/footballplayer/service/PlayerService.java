package football.footballplayer.service;

import football.footballplayer.member.Player;

public interface PlayerService {

    void join(Player player);

    Player findPlayer(String name);
}
