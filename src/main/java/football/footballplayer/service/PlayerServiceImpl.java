package football.footballplayer.service;

import football.footballplayer.member.Player;
import football.footballplayer.repository.PlayerMemoryRepository;
import football.footballplayer.repository.PlayerRepository;

public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository repository) {
        this.playerRepository = repository;
    }

    @Override
    public void join(Player player) {
        playerRepository.save(player);
    }

    @Override
    public Player findPlayer(String name) {
        return playerRepository.findByName(name);
    }
}
