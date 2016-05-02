package org.javajunior.quest.dialog;

import java.util.List;

/**
 * Represents state in game.
 */
public interface State {

    String[] getPossibleMoves();

    List<State> getTransitionTable();

    State onEnter(State previousState);

}