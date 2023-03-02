package Command;

public class RunCommand implements ICommand {
    private Character character;

    public RunCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.run();
    }
}
