// Rule 14. Serialization (SER)
// SER00-J. Enable serialization compatibility during class evolution

// Compliant Solution (serialVersionUID) 

class GameWeapon implements Serializable {
  private static final long serialVersionUID = 24L;
 
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
