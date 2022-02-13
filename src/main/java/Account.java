public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(){

        if (name == null || name.length() < 3 || name.length() > 19) {
            return false;
        }

        if (name.startsWith(" ")) {
            return false;
        }

        if (name.endsWith(" ")) {
            return false;
        }

        if (!name.contains(" ")) {
            return false;
        }

        if (countGap() != 1 ) {
            return false;
        }

        return true;
    }

    public int countGap(){
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
