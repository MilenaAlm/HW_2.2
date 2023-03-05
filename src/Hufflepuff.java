class Hufflepuff extends Hogwarts {
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,
                      String faculty,
                      int magicPower,
                      int transgressionDistance,
                      int hardWorking,
                      int loyalty,
                      int honesty) {
        super(name, faculty, magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void PrintHufflepuff() {
        System.out.println ("Имя: " + getName() +
                ", из факультета: " + getFaculty() +
                ", имеет свойства: cила магии = " + getMagicPower() +
                ", расстояние трансгресии = " + getTransgressionDistance() +
                ", трудолюбие = " + getHardWorking()+
                ", верность = " + getLoyalty() +
                ", честность = " + getHonesty());
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int ability(){
        return hardWorking + loyalty + honesty;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff){
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2){
            System.out.printf("Пуффендуйец %s лучше, чем пуффендуйец %s: %d VS %d%n",
                    getName(),
                    hufflepuff.getName(),
                    ability1,
                    ability2
            );
        } else if ( ability2 > ability1) {
            System.out.printf("Пуффендуйец %s лучше, чем пуффендуйец %s: %d VS %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        }else {
            System.out.printf("Пуффендуйец %s такой же, как пуффендуйец %s: %d VS %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }

    }
}

