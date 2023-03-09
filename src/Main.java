public class Main {
    public static void main(String[] args) {

        Gryffindor HarryPotter =  new Gryffindor("Гарри Поттер", "Гриффиндор", 34, 45, 67, 54, 12);
        Gryffindor HermioneGranger = new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 14, 23, 56, 74, 20);
        Gryffindor RonWeasley = new Gryffindor("Рон Уизли", "Гриффиндор", 65, 15, 16, 47, 41);
        Hufflepuff ZachariasSmith = new Hufflepuff("Захария Смит", "Пуффендуй", 23, 34, 83, 54, 36);
        Hufflepuff CedricDiggory = new Hufflepuff("Седрик Диггори", "Пуффендуй", 37, 60, 33, 43, 23);
        Hufflepuff JustinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 51, 23, 53, 44, 12);
        Slytherin DracoMalfoy = new Slytherin("Драко Малфой", "Слизерин", 34, 36, 81, 37, 27, 45, 23);
        Slytherin GrahamMontagu =  new Slytherin("Грэхэм Монтегю", "Слизерин", 12, 49, 38, 28, 40,13,45);
        Slytherin GregoryGoyle = new Slytherin("Грегори Гойл", "Слизерин", 48, 55, 45, 30, 71, 67,29);
        Kogtevran ZhouChang = new Kogtevran("Чжоу Чанг", "Когтевран", 55, 28, 67, 44, 27, 58);
        Kogtevran PadmaPatil  = new Kogtevran("Падма Патил", "Когтевран", 61, 49, 87, 56, 73, 47);
        Kogtevran MarcusBelby = new Kogtevran("Маркус Белби", "Когтевран", 35, 59, 69, 24, 42, 89);

        HarryPotter.PrintGryffindor();
        ZachariasSmith.PrintHufflepuff();
        GrahamMontagu.PrintSlytherin();
        ZhouChang.PrintKogtevran();

        HarryPotter.compareHogwarts(ZhouChang);
        HarryPotter.compareGryffindor(HermioneGranger);
    }




}
