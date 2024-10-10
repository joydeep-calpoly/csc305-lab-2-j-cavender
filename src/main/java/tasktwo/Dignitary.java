package tasktwo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

class Dignitary {
  private String name;
  private List<Award> awards;
  private List<String> knownFor;

  @JsonCreator
  private Dignitary(@JsonProperty("name") String name, @JsonProperty("awards") List<Award> awards,
                    @JsonProperty("knownFor") List<String> knownFor) {
    this.name = name;
    this.awards = awards;
    this.knownFor = knownFor;
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
