import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < dnaStrand.length(); i++){
            sb.append(map.get(dnaStrand.charAt(i)));
        }
        
        return sb.toString();
    }

}
