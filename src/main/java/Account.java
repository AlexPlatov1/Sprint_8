public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length()<3 || name.length()>19){
            return false;
        }
        int spaceCount = 0;
        for (char c : name.toCharArray()){
            if (c ==' '){
                spaceCount++;
            }
        }
        if (spaceCount!=1 ){
            return false;
        }
        if (name.startsWith(" ")|| name.endsWith(" ")){
            return false;
        }
        return true;
    }

}