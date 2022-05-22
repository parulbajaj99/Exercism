class TwelveDays {
    private static String[] days = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh",
        "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private static String[] gifts = new String[]{
        "a Partridge in a Pear Tree.",
        "two Turtle Doves, ",
        "three French Hens, ",
        "four Calling Birds, ",
        "five Gold Rings, ",
        "six Geese-a-Laying, ",
        "seven Swans-a-Swimming, ",
        "eight Maids-a-Milking, ",
        "nine Ladies Dancing, ",
        "ten Lords-a-Leaping, ",
        "eleven Pipers Piping, ",
        "twelve Drummers Drumming, "
    };

    
    public void sing() {
        StringBuilder verses = new StringBuilder("");
        
        for(int day = 0; day < days.length; day++){
            verses.append("On the ");
            verses.append(days[day]);
            verses.append(" day of Christmas my true love gave to me: ");

            for(int verse = day; verse >= 0 ; verse--){
                if(isFirstVerse(verse) && notFirstDay(day)){
                    verses.append("and ");
                }
                verses.append(gifts[verse]);
            }
            verses.append("\n\n");
        }

        System.out.println(verses);
    }


    private boolean notFirstDay(int day) {
        return day != 0;
    }


    private boolean isFirstVerse(int verse) {
        return verse == 0;
    }

}

public class App{
    public static void main(String[] args) throws Exception {
        TwelveDays twelveDays = new TwelveDays();
        twelveDays.sing();
    }
}
