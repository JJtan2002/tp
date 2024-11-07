package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_EXIT_ACKNOWLEDGEMENT = "Exiting Address Book as requested ...";
    private static final boolean IS_UNDOABLE = false;

    @Override
    public CommandResult execute(Model model) {
        if (IS_UNDOABLE) {
            model.addCommandToLog(this);
        }
        return new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true, false, false);
    }

    @Override
    public void undo(Model model) {

    }

    @Override
    public boolean canBeUndone() {
        return IS_UNDOABLE;
    }
}
