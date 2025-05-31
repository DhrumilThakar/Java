class light {
    public light()
    {
        System.out.println("hii!");
    }
    
}
class tublight extends light
{
    public tublight()
    {
        System.out.println("Tublight!");
    }
}
public class utility
{
    public static void main(String[] args)
    {
        tublight t = new tublight();
    }
}
