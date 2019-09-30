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
        user = new User(99, "namelowercase", "familynamelowercase");
        assertEquals(99, user.getNumber());
    }

    @Test
    void testUserGetName() {
        user = new User(99, "namelowercase", "familynamelowercase");
        assertEquals("Namelowercase", user.getName());
    }

    @Test
    void testUserGetFamilyName() {
        user = new User(99, "namelowercase", "familynamelowercase");
        assertEquals("Familynamelowercase", user.getFamilyName());
    }

    @Test
    void testGetNameFullUpperCase() {
        user = new User(99, "namelowercase", "familynamelowercase");
        assertEquals("NAMELOWERCASE", user.getNameFullUpperCase());
    }

    @Test
    void testGetFullNameLowerCase() {
        user = new User(99, "namelowercase", "familynamelowercase");
        assertEquals("familynamelowercase namelowercase", user.getFullNameLowerCase());
        user = new User(99, "NAMEUPPERCASE", "FAMILYNAMEUPPERCASE");
        assertEquals("familynameuppercase nameuppercase", user.getFullNameLowerCase());
    }
}
