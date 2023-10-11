public class Main {

  public static void main(String[] args){
    // String is the dataType
    // [] means it is an array
    // String[]  array of Strings
    // phrases is the name of the String[] variable, can be any name
    // new invokes the constructor of the String class
    // we give the values of that array in the { }
    String[] phrases = new String[]{"living zebras", "juicy oranges", "do the victory dance", "tusk of an elephant"};

    int[] positions = new int[]{0, 6, 7, 11};

    String name = Love.findLoveName(phrases, positions);
    System.out.println(name);
  }

}
