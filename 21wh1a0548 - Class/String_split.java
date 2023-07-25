class SplitEx
{
public static void main(String args[ ])
{
String s="My,name,is,Rishitha";
System.out.println("Actual string : "+s);

String[ ] words=s.split(",");
for(String word:words)
{
System.out.println(word);
}
}
}