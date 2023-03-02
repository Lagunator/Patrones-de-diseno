package Command;

public class CounterAttack implements ICommand {
    private Character character;

    public CounterAttack(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.run();
        character.jump();
        character.run();
        character.jump();
        character.protect();
        character.hit();
        character.heal();
        character.run();
    }
}
