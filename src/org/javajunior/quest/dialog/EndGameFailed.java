package org.javajunior.quest.dialog;

import org.javajunior.quest.character.PlayerAware;

import java.util.List;

public class EndGameFailed implements State {
    @Override
    public String[] getPossibleMoves() {
        return null;
    }

    @Override
    public List<State> getTransitionTable() {
        return null;
    }

    @Override
    public State onEnter(State previousState, PlayerAware playerAware) {
        System.out.println("Поджав хвост ты ушел с поля боя, дракон в то время съел всю деревню.");
        return null;
    }
}
