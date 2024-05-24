package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_shouldReturn0_whenCalled(){
        int expected = 0;
        assertEquals(expected, PlayerCharacter.getX());
    }

    @Test
    void getY_shouldReturn0_whenCalled(){
        int expected = 0;
        assertEquals(expected, PlayerCharacter.getY());
    }

    @Test
    void move_shouldReturnTrue_whenCalledW(){
        assertTrue(PlayerCharacter.move("w"));
    }
}