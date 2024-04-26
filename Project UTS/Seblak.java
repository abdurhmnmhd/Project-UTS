class Seblak extends Food {
    private Bumbuseblak Bumbuseblak;
  
    public Seblak(String name, Bumbuseblak Bumbuseblak) {
      super(name);
      this.Bumbuseblak = Bumbuseblak;
    }
  
    @Override
    public void prepare() {
      System.out.println(" Pembuatan " + getName() + " dengan " + Bumbuseblak.getQuantity() + " grams penyedap rasa.");
    }
  }