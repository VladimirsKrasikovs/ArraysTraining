public class SinoTibeten extends Language{

    SinoTibeten (String name, int numSpeakers){

        super(name,numSpeakers,"Asia","subject-object-verb");

        if (name.contains("Chinese")){
         this.wordOrder = "subject-verb-object";
        }
    }
}
