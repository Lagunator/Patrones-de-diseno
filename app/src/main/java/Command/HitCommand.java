package Command;

public class HitCommand implements ICommand {
    private Character character;

    public HitCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.hit();
    }
}
