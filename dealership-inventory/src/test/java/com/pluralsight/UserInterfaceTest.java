package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    void display() {
        UserInterface ui = new UserInterface();
        ui.display();
    }
}