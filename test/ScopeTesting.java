class ScopeTesting {
	public static void main(String args[]) {
    int i;
    char favoriteLetter = 'r';
    boolean large = true;
    for (i = 0; i < 10; i++) {
      if (i <7) {
        System.out.println("Small enough to work with");
      }
      else {
        System.out.println(large);
      }
      System.out.println(large);
      System.out.println(favoriteLetter);
    }
    System.out.println(favoriteLetter);
  }
}
