package com.java.mastery.enum_exercise;

/**
 * Created by ANAN011 on 10/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Enum exercise with tenary operator exercise
 */

enum CommandEnum {
  ADD(IConstants.ADD),
  DELETE(IConstants.DELETE),
  UPDATE(IConstants.UPDATE);

  private String enumValue;

  CommandEnum(String enumValue) {
    this.enumValue = enumValue;
  }

  public static CommandEnum getEnumByCommandName(String command) {
    for (CommandEnum value : CommandEnum.values()) {
      if (value.enumValue.equals(command)) {
        return value;
      }
    }
    return null;
  }
}

public class TestEnum2 {
  public static void main(String[] args) {
    CommandEnum addCommand = CommandEnum.getEnumByCommandName(IConstants.ADD);
    System.out.println(addCommand.name());

    CommandEnum deleteCommand = CommandEnum.getEnumByCommandName(IConstants.DELETE);
    System.out.println(deleteCommand.name());

    CommandEnum command = CommandEnum.getEnumByCommandName(IConstants.EDIT);
    command = isEnumNull(command) ? addCommand : command;
    System.out.println(command.name());
  }

  private static boolean isEnumNull(CommandEnum commandEnum) {
    return commandEnum == null;
  }
}

