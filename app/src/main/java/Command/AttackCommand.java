package Command;

public class AttackCommand implements ICommand {
    private Character character;

    public AttackCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.run();
        character.jump();
        character.hit();
    }
}
