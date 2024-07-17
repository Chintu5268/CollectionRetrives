public class HashCodeOverride {
  private int age;
  private String name;
  
  public HashCodeOverride(int age, String name) {
    this.age = age;
    this.name = name;
  }
  @Override
  public boolean equals(Object obj) {
    if (this==obj) {
      return true;
    }
    if (obj==null|| getClass() != obj.getClass()) {
      return false;
    }
      HashCodeOverride hashCodeOverride = obj;
    return age==hashCodeOverride.age && name.equals(hashCodeOverride.name);
  }

  
}
