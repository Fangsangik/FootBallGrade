package football.footballplayer.distance;

import football.footballplayer.member.Player;

import java.util.List;

public class RunDistance implements Distance {
    private final Distance distance;
    private List<Player> playerList;

    private RunningAction runningAction;

    public RunDistance(Distance distance) {
        this.distance = distance;
    }

    @Override
    public void join(Player player) {
        distance.join(player);
    }

    @Override
    public Player findByName(Player player) {
        return distance.findByName(player);
    }

    @Override
    public RunDistance getTotalDistanceRun() {
        double totalDistance = 0.0;
        for (Player player
                : playerList) {
        totalDistance += runningAction.getDistance();
        }

        return new Distance(totalDistance, "km");
    }

    @Override
    public RunDistance getMaxDistanceRun() {
        return null;
    }
}