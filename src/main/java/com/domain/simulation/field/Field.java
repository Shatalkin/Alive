package com.domain.simulation.field;

import com.domain.simulation.entities.Entity;
import com.domain.simulation.field.matrix.MatrixEntities;

public interface Field {

    /**
     * Calls {@link Entity#makeAMove()} on each alive entity.
     */
    void update();

    void putEntity(Entity entity);

    MatrixEntities cellsMatrix();

    int aliveEntitiesCount();

    int width();

    int height();
}
