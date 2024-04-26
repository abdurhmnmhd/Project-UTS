class Bumbu {
    private int quantity;
    private String name;
  
    Bumbu(String name, int quantity) {
      this.name = name;
      this.quantity = quantity;
    }
  
    public int getQuantity() {
      return quantity;
    }
  
    public String getName() {
      return name;
    }
  }
  
  class Bumbuseblak extends Bumbu {
    public Bumbuseblak(int quantity) {
      super("Bumbu seblak", quantity);
    }
  }