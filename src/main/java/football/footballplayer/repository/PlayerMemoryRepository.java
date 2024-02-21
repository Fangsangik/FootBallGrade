package football.footballplayer.repository;

import football.footballplayer.member.Player;

import java.util.HashMap;

public class PlayerMemoryRepository implements PlayerRepository{

    private static HashMap<String, Player> store = new HashMap<>();

    @Override
    public void save(Player player) {
        store.put(player.getName(), player);
    }

    @Override
    public Player findByName(String name) {
        return store.get(name);
    }
}
