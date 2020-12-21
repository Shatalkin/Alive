package alive.entities;

import alive.entities.qualities.energy.Energy;
import alive.entities.qualities.position.Position;

public interface Entity {

    Position getPosition();

    Energy getEnergy();

    boolean isAlive();

    /**
     * Calls when entity makes a move.
     */
    void makeAMove();
}
