package test;

import com.epam.MapWithDuplicateHandling;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapWithDuplicateHandlingTest {

    @Test
    void shouldHandleDuplicateUsers() {
        List<String> users = List.of("ram", "shyam", "ram", "ram");

        Map<String, Integer> result =
                MapWithDuplicateHandling.countUsers(users);

        assertEquals(3, result.get("ram"));
        assertEquals(1, result.get("shyam"));
        assertEquals(2, result.size());
    }
    @Test
    void shouldReturnEmptyMapWhenUserListIsEmpty() {
        List<String> users = List.of();

        Map<String, Integer> result =
                MapWithDuplicateHandling.countUsers(users);

        assertTrue(result.isEmpty());
    }
    @Test
    void shouldHandleSingleUser() {
        List<String> users = List.of("ram");

        Map<String, Integer> result =
                MapWithDuplicateHandling.countUsers(users);

        assertEquals(1, result.get("ram"));
        assertEquals(1, result.size());
    }
    @Test
    void shouldHandleUniqueUsers() {
        List<String> users = List.of("ram", "shyam", "mohan");

        Map<String, Integer> result =
                MapWithDuplicateHandling.countUsers(users);

        assertEquals(1, result.get("ram"));
        assertEquals(1, result.get("shyam"));
        assertEquals(1, result.get("mohan"));
    }
    @Test
    void shouldThrowExceptionForNullInput() {
        assertThrows(NullPointerException.class, () ->
                MapWithDuplicateHandling.countUsers(null)
        );
    }

}

