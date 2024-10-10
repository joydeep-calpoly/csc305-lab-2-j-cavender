package taskone;

class Award {
  private final String name;
  private final int year;

  Award(String name, int year) {
    this.name = name;
    this.year = year;
  }

  public String toString() {
    return name + ", " + year;
  }
}
