package football.footballplayer.config;


import football.footballplayer.grade.Grade;
import football.footballplayer.grade.PlayAfterGrade;
import football.footballplayer.repository.PlayerMemoryRepository;
import football.footballplayer.repository.PlayerRepository;
import football.footballplayer.service.PlayerService;
import football.footballplayer.service.PlayerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PlayerRepository playerRepository(){
        return new PlayerMemoryRepository();
    }

    @Bean
    public PlayerService playerService(){
        return new PlayerServiceImpl(playerRepository());
    }

    @Bean
    public Grade playerGrade(){
        return new PlayAfterGrade();
    }
}
