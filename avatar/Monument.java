package avatar;

public abstract class Monument {
    private String name;

    public Monument(String name) {
        this.setName(name);
    }

    protected boolean validName(String name) {
        char[] nameToCharArr = name.toCharArray();
        for (char c : nameToCharArr) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    protected String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (validName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }

    }

    protected abstract int getAffinity();
}
