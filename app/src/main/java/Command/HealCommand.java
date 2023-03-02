package Command;

public class HealCommand implements ICommand {
    private Character character;

    public HealCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.heal();
    }
}
