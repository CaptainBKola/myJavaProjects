package DiaryProject;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {
    Entry entry = new Entry();

    @Test
    void testClassExist() {
        assertNotNull(entry);
    }

    @Test
    void testForEntryDateIsNow(){
        Entry entry = new Entry();

        entry.setLocalDate(LocalDateTime.now());
        LocalDateTime testCurrentDate = LocalDateTime.now();

        entry.getLocalDate();
        assertEquals(testCurrentDate,entry.getLocalDate());





    }

















}

