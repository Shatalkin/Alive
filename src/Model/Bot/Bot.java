package Model.Bot;

import Model.Bot.Command.DirectCommands.Photosynthesis;
import Model.Bot.Command.ICommand;
import Model.Field;

public class Bot implements IBot {

    public final Vector2Dint coordinates;

    private int energy;

    private int index;

    private final ICommand[] commands;

    public Bot(int x, int y, int energy) {
        coordinates = new Vector2Dint(x, y);
        this.energy = energy;

        /*
         * At the start each bot has photosynthesis commands only.
         */
        commands = new ICommand[64];
        for (var i = 0; i < commands.length; ++i) {
            commands[i] = new Photosynthesis();
        }
    }

    @Override
    public void makeAMove(Field field) {

        index = (index + commands[index].run(this, field)) % commands.length;
        energy -= 4;
    }

}
