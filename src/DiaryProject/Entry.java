package DiaryProject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

  private LocalDateTime localDateTime;

    public void  setLocalDate(LocalDateTime currentDate) {
        localDateTime = currentDate.now();

    }


  public LocalDateTime getLocalDate() {

      return localDateTime;
  }
}
