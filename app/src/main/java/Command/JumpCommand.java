package Command;

public class JumpCommand implements ICommand {
    private Character character;

    public JumpCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }
}
