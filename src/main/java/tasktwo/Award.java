package tasktwo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Award {
  private String name;
  private int year;

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("year")
  public int getYear() {
    return year;
  }

  public String toString() {
    return name + ", " + year;
  }
}
