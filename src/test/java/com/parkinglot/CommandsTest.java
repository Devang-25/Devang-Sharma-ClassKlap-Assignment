package com.parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DEVANG SHARMA on 02/07/2020.
 */
public class CommandsTest {
    Commands commands = new Commands();
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(commands.commandsMap.isEmpty());
        assertTrue(commands.commandsMap.containsKey("create_parking_lot"));
        assertFalse(commands.commandsMap.containsKey("mytestcommand"));
    }
}