package test.mackitobased;

import com.interview.epam.VowelCountService;
import com.interview.epam.WordRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VowelCountServiceTest {

    @Mock
    private WordRepository wordRepository;

    @InjectMocks
    private VowelCountService vowelCountService;

    @Test
    void shouldCountVowelsUsingMockedRepository() {
        when(wordRepository.fetchWords())
                .thenReturn(List.of("Apple", "Java", "Stream", "Interview"));

        Map<String, Long> result = vowelCountService.countVowels();

        assertEquals(2L, result.get("Apple"));
        assertEquals(2L, result.get("Java"));
        assertEquals(2L, result.get("Stream"));
        assertEquals(4L, result.get("Interview"));

        verify(wordRepository, times(1)).fetchWords();
    }
}

