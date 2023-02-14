import java.util.*;

public class Tables {
    HashMap<String, String> prevTable;
    HashMap<String, String> newTable;

    Tables(){
        prevTable = new HashMap<>();
        newTable = new HashMap<>();
        prevTable.put("url", "html3");
        prevTable.put("url2", "html2");
        prevTable.put("url1", "html1");
        newTable.put("url2", "html22");
        newTable.put("url4", "html4");
        newTable.put("url5", "html5");
    }

    private Set<String> intersectionKeys(){
        Set<String> newKeys = new HashSet<>(newTable.keySet());
        Set<String> intersectionKeys = new HashSet<>(prevTable.keySet());
        intersectionKeys.retainAll(newKeys);
        return intersectionKeys;
    }

    public Set<String> keysWithChangedValues(){
        Set<String> keysWithChangedValues = new HashSet<>();
        Set<String> intersectionKeys = intersectionKeys();
        for (String key:intersectionKeys) {
            if (!prevTable.get(key).equals(newTable.get(key))){
                keysWithChangedValues.add(key);
            }
        }
        return keysWithChangedValues;
    }

    public Set<String> keysInPrevOnly(){
        Set<String> prevKeys = new HashSet<>(prevTable.keySet());
        prevKeys.removeAll(intersectionKeys());
        return prevKeys;
    }

    public Set<String> keysInNewOnly(){
        Set<String> newKeys = new HashSet<>(newTable.keySet());
        newKeys.removeAll(intersectionKeys());
        return newKeys;
    }

}

