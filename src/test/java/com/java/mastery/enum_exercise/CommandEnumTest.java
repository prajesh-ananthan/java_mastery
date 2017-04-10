package com.java.mastery.enum_exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by ANAN011 on 10/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class CommandEnumTest {
  private static final String ADD = "ADD";
  private static final String DELETE = "DELETE";

  @Test
  public void test_enum_is_not_null() {
    //given

    //when
    final CommandEnum addCommand = CommandEnum.getEnumByCommandName(IConstants.ADD);
    final CommandEnum deleteCommand = CommandEnum.getEnumByCommandName(IConstants.DELETE);
    //then
    assertThat(addCommand, is(notNullValue()));
    assertThat(deleteCommand, is(notNullValue()));
  }

  @Test
  public void getEnumNameTest() {
    //given

    //when
    final CommandEnum addCommand = CommandEnum.getEnumByCommandName(IConstants.ADD);
    final CommandEnum deleteCommand = CommandEnum.getEnumByCommandName(IConstants.DELETE);

    //then
    assertThat(addCommand.name(), is(ADD));
    assertThat(deleteCommand.name(), is(DELETE));
  }
}