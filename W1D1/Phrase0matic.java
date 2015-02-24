public class PhraseOmatic {
public static void main (String[] args) {

String[] wordListOne = {"24/7" ,"multi-Tier","
30,OOO foot", "B-to-B" , "win-win" , "front-end"
, "web- based" , "pervasive", "smart", "six-sigma",
"critical-path" , "dynamic"} ;

String[] wordListTwo = { "empowered", "sticky",
"value-added.", "oriented", "centric", "distributed",
"clustered", "branded", "outside-the-box", "positioned",
"networked", " focused" , "leveraged", "aligned",
"targeted", "shared" , "cooperative", "accelerated"};

String[] wordListThree = {"process", "tipping-point",
"solution", "architecture", "core competency" ,
"strategy", "mindshare", "portal" , "apace" , "vision",
"paraadigm","mission"};

// find out how many words are in each list
int one.Length = wordListOne.length;
int two.Length = wordListTwo.length;
int three.Length =wordListThree.length;
// generate three random numbers
int randl = (int) (Math.random() * oneLength);
int rand2 = (int) (Math .random()* twoLength);
int rand3 = (int) (Math.randaom() * threeLength);
//now build a phrase
String phrase= wordListOne [randl] + " " +
wordListTwo[rand2] + " " + wordListTbree[rand3] ;
// print out the phrase
System.out.println("What we need is a "+ phrase);
}
}