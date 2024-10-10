package tasktwo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Dignitary {
  private String name;
  private List<Award> awards;
  private List<String> knownFor;

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("awards")
  public List<Award> getAwards() {
    return awards;
  }

  @JsonProperty("knownFor")
  public List<String> getKnownFor() {
    return knownFor;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name).append("\n\n");
    sb.append("Known For:\n");
    for (String known : knownFor) {
      sb.append("\t").append(known).append("\n");
    }
    sb.append("Awards: \n");
    for (Award award : awards) {
      sb.append("\t").append(award).append("\n");
    }
    return sb.toString();
  }
}
