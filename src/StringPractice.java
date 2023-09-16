import java.security.spec.RSAOtherPrimeInfo;

public class StringPractice
{
  static StringPractice stringPractice = new StringPractice();
 public static void main(String[] arg)
 {
stringPractice.concatination();
stringPractice.contains();
stringPractice.delete();
stringPractice.Endwith();
stringPractice.compair();
extract();
len();
start();
position();
replacechar();
 }
void concatination()
{
System.out.println("\n PHP Exercises and " + " Python Exercises  \n");
}

// contain meathod applies when find specific word of that string is there either it is there result is true or not result is false

void contains(){
     String one = " i have 4 bus and 2 truks";
     String two = "truks";
     System.out.println("Original String: "+ one);
     System.out.println("Specified sequence of char values:" + two);
     System.out.println(one.contains(two));
}
// to remove all spacial char to apply replaceall
    void delete()
    {
       String one = "£30.00 are not equal to £20";
       String reasult =one.replaceAll("£","");
       System.out.println("\n old:"+ one);
       System.out.println(" new :" + reasult+ "\n");
    }
    // endsWith method
    void Endwith()
    {
        String one = "Maulik savaliya";
        System.out.println(one.endsWith("ya"));
        String two = "Maulik savaliya";
        System.out.println(two.endsWith("Ya")+"\n");

    }
    // eqalsignorecase mean two stings char is equal
void compair()
{
    String one = "MAULIK SAVALIYA";
    String two = "maulik savaliya";
    String three = "Ambika";
    System.out.println(one.equalsIgnoreCase(two));
    System.out.println(one.equalsIgnoreCase(three));
}
// replace all number in string
static void extract()
{
    String one ="abc123def 456 hij 789";
    String number = one.replaceAll("[^0-9]","");
    System.out.print("\nold : " + one );
    System.out.print("\nnew : "+ number+"\n");
}
// to find length of char
static void len()
{
  String one= "maulik_savaliya";
  int lan= one.length();
  System.out.println("\nchr :" + one);
  System.out.println("length of chr :" +lan);
}
// given string start with other string is true or false using string.startWith(onether string)
  static void start()
  {
   String one="india won against pakistan";
   String two="pakistan won against india";
   String three="india";
   boolean four=one.startsWith(three);
   boolean five=two.startsWith(three);
   System.out.println("\n"+one+ " start with " +three+ " is "+ four);
   System.out.println(two+ " start with " +three+ " is "+ five);
  }
    // one.substring(value to find) mean to find char
  static void position()
  {
   String one ="my name is maulik";
   String two =one.substring(3,10);
   System.out.println("\nold :"+one);
   System.out.println("new :"+two);
  }
  // replace all char
    static void replacechar()
    {
     String one ="maulik savaliya";
     String two =one.replaceAll("a","M");
     System.out.println("\nold: "+one);
     System.out.println("new: "+two);

    }





}
