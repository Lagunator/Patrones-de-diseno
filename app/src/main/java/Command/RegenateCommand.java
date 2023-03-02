package Command;

public class RegenateCommand implements ICommand {
    private Character character;

    public RegenateCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.protect();
        character.heal();
    }
}
