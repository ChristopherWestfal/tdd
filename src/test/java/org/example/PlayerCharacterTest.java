package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @BeforeEach
    void setUp() {
        PlayerCharacter.reset();
    }

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

    @Test
    void move_shouldReturnTrue_whenCalledS(){
        assertTrue(PlayerCharacter.move("s"));
    }

    @Test
    void move_shouldReturnTrue_whenCalledD(){
        assertTrue(PlayerCharacter.move("d"));
    }

    @Test
    void move_shouldReturnTrue_whenCalledA(){
        assertTrue(PlayerCharacter.move("a"));
    }
}