public class Love {
  /*static if will be invoked by class*/
  /*returned datatype*/
  public  static  String findLoveName(String[] stringArray, int[] locations){
    /**
     * stringArray = ["living zebras", "juicy oranges", "do the victory dance", "tusk of an elephant"]
     *     index              0                 1                   2                     3
     *
     *              l  o  v   e
     * locations = [0, 6, 7, 11]
     *  index       0  1  2   3
     *
     * Characters c1,c2,c3,c4
     *
     * stringArray[index:0] = "living zebras"             locations[index:0] = 0
     * stringArray[index:1] = "juicy oranges"             locations[index:1] = 6
     * stringArray[index:2] = "do the victory dance"      locations[index:2] = 7
     * stringArray[index:3] = "tusk of an elephant"       locations[index:3] = 11
     *
     *
     * c1 = stringArray[0].charAt(locations[0]) -> l
     * c2 = stringArray[1].charAt(locations[1]) -> o
     * c3 = stringArray[2].charAt(locations[2]) -> v
     * c4 = stringArray[3].charAt(locations[3]) -> e
     * String loveName =  c1+c2+c3+c4;
     * */
    String c1,c2,c3,c4;
    c1 = Character.toString(stringArray[0].charAt(locations[0])) ;
    c2 = Character.toString(stringArray[1].charAt(locations[1]));
    c3 = Character.toString(stringArray[2].charAt(locations[2]));
    c4 = Character.toString(stringArray[3].charAt(locations[3]));

    String loveName = c1+c2+c3+c4;
    System.out.println(loveName);
    return loveName;
  }
}
