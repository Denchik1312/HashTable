import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Tables tablesComparator = new Tables();
        LetterFormer letterFormer = new LetterFormer();

        Set<String> keysChanged = tablesComparator.keysWithChangedValues();
        Set<String> keysPrev = tablesComparator.keysInPrevOnly();
        Set<String> keysNew = tablesComparator.keysInNewOnly();
        letterFormer.formLetter1(keysChanged, keysPrev, keysNew);

    }
}
