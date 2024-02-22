package football.footballplayer.member;

import football.footballplayer.distance.Distance;
import football.footballplayer.type.Action;
import football.footballplayer.type.Position;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int age;
    private Position position;
    private List<Action> actions;

    public Player(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.actions = new ArrayList<>(); // 선수의 행동을 담을 리스트 초기화
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    // 선수의 행동 추가
    public void addAction(Action action) {
        actions.add(action);
    }

    // 선수의 모든 행동 반환
    public List<Action> getActions() {
        return actions;
    }
}