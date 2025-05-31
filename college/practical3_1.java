
   abstract class Instrument
   {
    abstract void play();
    String what()
    {
        String s = "Instrument";
        return s;
    }
    abstract void adjust();
   } 
   class Wind extends Instrument
   {
    void play()
    {
        System.out.println("Play from wind");
    }
    String What()
    {
        String sc = "Wind";
        return sc;
    }
    void adjust()
    {
        System.out.println("From wind");
    }
   }
   class Percussion extends Instrument
   {
    void play()
    {
        System.out.println("Play from Percussion");
    }
    String What()
    {
        String se = "Percussion";
        return se;
    }
    void adjust()
    {
        System.out.println("From Percussion");
    }
   }
   class Stringed extends Instrument
   {
        void play()
        {
            System.out.println("From Stringed");
        }
        String What()
        {
            String sq = " Stringed";
            return sq;
        }
        void adjust()
        {
            System.out.println("From Stringed!");
        }
   }
   class WoodWind extends Wind
   {
    void play()
    {
        System.out.println("from WooodWind");
    }
    String What()
    {
        String s1 = "WoodWind";
        return s1;
    }
   }
   class Brass extends Wind
   {
    void play()
    {
        System.out.println("from Brass");
    }
    void adjust()
    {
        System.out.println("From Brass");
    }
}
class practical3_1
{
   public static void main(String[] args) {
    Percussion i = new Percussion();
    i.play();
    i.adjust();
    System.out.println(i.What());
    Stringed s = new Stringed();
    s.play();
    System.out.println(s.What());
    s.adjust();
    Wind w = new Wind();
    w.play();
    System.out.println(w.What());
    w.adjust();
    WoodWind ww = new WoodWind();
    ww.play();
    System.out.println(ww.What());
    Brass b = new Brass();
    b.play();
    b.adjust();
   }
}