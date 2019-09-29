package es.upm.miw.iwvg.ecosystem.practica;


import es.upm.miw.iwvg.ecosystem.practica.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "testUserName", "testUserFamilyName");
    }

    @Test
    void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("Testusername", user.getName());
        assertEquals("Testuserfamilyname", user.getFamilyName());
    }

    @Test
    void testUserFormat() {
        user = new User(1, "namelowercase", "FAMILYNAMEUPPERCASE");
        assertEquals("Namelowercase", user.getName());
        assertEquals("Familynameuppercase", user.getFamilyName());
    }

    @Test
    void testUserFullName() {
        assertEquals("Testusername Testuserfamilyname", user.fullName());
    }

    @Test
    void testUserInitials() {
        assertEquals("T.", user.initials());
    }

    @Test
    void testUserGetNumber() {
        user = new User(99, "abc", "xyz");
        assertEquals(99, user.getNumber());
    }

    @Test
    void testUserGetName() {
        user = new User(99, "abc", "xyz");
        assertEquals("Abc", user.getName());
    }

    @Test
    void testUserGetFamilyName() {
        user = new User(99, "abc", "xyz");
        assertEquals("Xyz", user.getFamilyName());
    }

}
