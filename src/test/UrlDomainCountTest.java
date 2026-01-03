package test;

import com.utttara.wipro.UrlDomainCount;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UrlDomainCountTest {

    private final List<String> urls = Arrays.asList(
            "http://www.example.com/blah_blah",
            "http://www.google.com/wpstyle/?p=364",
            "http://www.yahoo.com/testcat_au.html",
            "http://www.google.com/events/#&product=browser",
            "http://www.example.com/wpstyle/?p=364"
    );

    @Test
    void testSolutionOne() {
        Map<String, Integer> result = UrlDomainCount.solutionOne(urls);

        assertEquals(2, result.get("www.example.com"));
        assertEquals(2, result.get("www.google.com"));
        assertEquals(1, result.get("www.yahoo.com"));
    }

    @Test
    void testSolutionTwo() {
        Map<String, Long> result = UrlDomainCount.solutionTwo(urls);

        assertEquals(2L, result.get("www.example.com"));
        assertEquals(2L, result.get("www.google.com"));
        assertEquals(1L, result.get("www.yahoo.com"));
    }

    @Test
    void testSolutionThree() {
        Map<String, Long> result = UrlDomainCount.solutionThree(urls);

        assertEquals(2L, result.get("www.example.com"));
        assertEquals(2L, result.get("www.google.com"));
        assertEquals(1L, result.get("www.yahoo.com"));
    }

    @Test
    void testSolutionFour_containsDomains() {
        Map<String, Long> result = UrlDomainCount.solutionFour(urls);

        assertTrue(result.containsKey("www.example.com"));
        assertTrue(result.containsKey("www.google.com"));
        assertTrue(result.containsKey("www.yahoo.com"));
    }

    @Test
    void testEmptyList() {
        Map<String, Integer> result = UrlDomainCount.solutionOne(List.of());
        assertTrue(result.isEmpty());
    }
}

