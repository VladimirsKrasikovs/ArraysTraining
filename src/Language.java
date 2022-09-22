public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language (String languageName, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = languageName;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by" + numSpeakers + "people mainly in "+ regionsSpoken);
        System.out.println("The language follows the word order:" + wordOrder );
    }
    public int changeNumspeak(int numSpeakers){
        return this.numSpeakers;

    }

    public static void main(String[] args) {
       Language russian = new Language ("Russian", 15000, "EuroAsia", "Object" );
         russian.changeNumspeak(550);
        russian.getInfo();

       Language kiche = new Mayan("Kiche", 233000);


        Language mandarin = new SinoTibeten(" Mandarin Chinese", 500);



//       Language[] languages = {russian,kiche,mandarin};
//        for (Language li : languages){
//         li.getInfo();
//        }

    }
}

