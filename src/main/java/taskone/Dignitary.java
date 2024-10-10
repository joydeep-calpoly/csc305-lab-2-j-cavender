package taskone;

import java.util.List;

class Dignitary {
  private final String name;
  private final List<Award> awards;
  private final List<String> knownFor;

  Dignitary(String name, List<Award> awards, List<String> knownFor) {
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
