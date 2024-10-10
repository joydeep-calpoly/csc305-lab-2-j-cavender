package tasktwo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Award {
  private String name;
  private int year;

  @JsonProperty("name")
  private String getName() {
    return name;
  }

  @JsonProperty("year")
  private int getYear() {
    return year;
  }

  public String toString() {
    return name + ", " + year;
  }
}
