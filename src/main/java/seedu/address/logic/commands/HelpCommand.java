package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Format full help instructions for every command for display.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_HELP_MESSAGE = "Opened help window.";
    private static final boolean IS_UNDOABLE = false;

    @Override
    public CommandResult execute(Model model) {
        if (IS_UNDOABLE) {
            model.addCommandToLog(this);
        }
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false, false, false);
    }

    @Override
    public void undo(Model model) {

    }

    @Override
    public boolean canBeUndone() {
        return IS_UNDOABLE;
    }
}
