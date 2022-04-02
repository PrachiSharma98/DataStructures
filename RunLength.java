<!---------------------Given an input string, write a function that returns the Run Length Encoded string for the input string.
For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”-->
  public static void main(String[] args) {

  String inputString = "aaabbccccd";
  String outputString = "";

  int count = 1;
  for (int i = 0; i < inputString.length(); i++) {
   count = 1;
   while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
    count++;
    i++;
   }
   outputString = outputString + inputString.charAt(i) + count;
  }
  System.out.println("Input data string : " + inputString);
  System.out.println("Output data string after applying data compression technique : " + outputString);

 }

}
