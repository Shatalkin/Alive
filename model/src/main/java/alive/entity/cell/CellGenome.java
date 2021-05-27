package alive.entity.cell;

import alive.entity.Alive;
import alive.genome.Gene;
import alive.genome.Genome;


public class CellGenome implements Genome {

    private final Gene[] genes;

    private int currentGeneIdx;

    public CellGenome(Gene[] genes) {
        this.genes = genes;
    }

    @Override
    public void affect(Alive alive) {
        alive.heal(-10);
        if (alive.isAlive()) {
            genes[currentGeneIdx].affect(alive, this);
        }
    }

    @Override
    public void incrementGeneIndex(int increment) {
        currentGeneIdx = Math.floorMod(currentGeneIdx + increment, genes.length);
    }
}