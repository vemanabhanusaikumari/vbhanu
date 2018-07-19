import java.util.regex.Pattern;
{
public class Regex
{
public static void main(String[] args)
{
Pattern p=Pattern.compile("\\s");
String[] s=p.split("krishna is a good boy");
for(String string:s)
{
System.out.println(string);
}
}
}
