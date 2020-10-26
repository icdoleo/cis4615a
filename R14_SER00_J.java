// Rule 14. Serialization (SER)
// SER00-J. Enable serialization compatibility during class evolution

// Noncompliant Code Example 

class GameWeapon implements Serializable {
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}