static boolean istAnagramm(String erstesWort, String zweitesWort){
        //arg-String zu lowercase
        erstesWort = erstesWort.toLowerCase();
        zweitesWort = zweitesWort.toLowerCase();

        //String to map
        HashMap<Character, String> erstesWortMap = new HashMap<Character, Integer>();
        HashMap<Character, String> zweitesWortMap = new HashMap<Character, Integer>();
        erstesWorMap.putAll(toCharCountMap(erstesWort));
        zweitesWortMap.putAll(toCharCountMap(zweitesWort));
        //compare maps & return boolean
        return  (erstesWortMap.equals(zweitesWortMap));

    }

 static HashMap toCharCountMap(String wort) {
    HashMap<Character, Integer> wortMap = new HashMap<Character,Integer>();
    int count = 1;
    for (int i = 0; i < wort.length(); i++) {
        if (wortMap.get(wort.charAt(i)) != null) {
            wortMap.put(wort.charAt(i), wortMap.get(wort.charAt(i)) + 1);
        }
        else
            wortMap.put(wort.charAt(i),  + 1);
    }
    return wortMap;
}
