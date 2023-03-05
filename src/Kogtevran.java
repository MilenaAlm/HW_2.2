class Kogtevran extends Hogwarts {
    private int smarty;
    private int wisdom;
    private int wit;
    private int fullOfCreative;

    public Kogtevran(String name,
                     String faculty,
                     int magicPower,
                     int transgressionDistance,
                     int smarty,
                     int wisdom,
                     int wit,
                     int fullOfCreative) {
        super(name, faculty, magicPower, transgressionDistance);
        this.smarty = smarty;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreative = fullOfCreative;
    }
    public void PrintKogtevran() {
        System.out.println ("Имя: " + getName() +
                ", из факультета: " + getFaculty() +
                ", имеет свойства: cила магии = " + getMagicPower() +
                ", расстояние трансгресии = " + getTransgressionDistance() +
                ", ум = " + getSmarty()+
                ", мудрость = " + getWisdom() +
                ", остроумие = " + getWit() +
                ", творчество = " + getFullOfCreative());
    }
    public int getSmarty() {
        return smarty;
    }

    public void setSmarty(int smarty) {
        this.smarty = smarty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullOfCreative() {
        return fullOfCreative;
    }

    public void setFullOfCreative(int fullOfCreative) {
        this.fullOfCreative = fullOfCreative;
    }
    private int ability(){
        return smarty + wisdom + wit + fullOfCreative;
    }

    public void compareKogtevran(Kogtevran kogtevran){
        int ability1 = ability();
        int ability2 = kogtevran.ability();
        if (ability1 > ability2){
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",
                    getName(),
                    kogtevran.getName(),
                    ability1,
                    ability2
            );
        } else if ( ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",
                    kogtevran.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        }else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n",
                    kogtevran.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }

    }
}