public class Mayan extends Language{

    Mayan (String languageName, int speakers){
        super (languageName, speakers, "Central Amerika",
                "verb-object-subject");
    }

    @Override
    public void getInfo(){
         name = "Ki' che";
        System.out.println(name + " is spoken by" + numSpeakers + "people mainly in "+ regionsSpoken);
        System.out.println("The language follows the word order:" + wordOrder);
        System.out.println("Fun fact: " + name + " is an ergative language.");

    }
}
