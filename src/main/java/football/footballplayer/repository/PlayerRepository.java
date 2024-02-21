package football.footballplayer.repository;

import football.footballplayer.member.Player;

public interface PlayerRepository {

    void save(Player player);

    Player findByName(String name);
}
