package Project;

import java.util.Random;

public class WordBase {

    private String[] words() {
        return new String[]{
                "dom", "pies", "kot", "drzewo", "kwiat", "lampa",
                "ryba", "narty", "klawis", "słońce", "woda", "butelka",
                "okno", "mleko", "aparat", "kubek", "piłka", "telew",
                "samoch", "stolik", "kotek", "lampa", "plecak", "samol",
                "muzyka", "rower", "fotel", "kawa", "kolor", "butel",
                "kotek", "słowo", "lato", "film", "most", "trawa",
                "lód", "książka", "praca", "miłość", "ryba", "słuch",
                "kino", "pociąg", "port", "okręt", "portre", "butelk",
                "laptop", "świat", "koło", "fotel", "basen", "kamera",
                "świeca", "okno", "słoń", "statu", "waza", "bilet",
                "szalik", "koszy", "kotek", "piłka", "świec", "okno",
                "kotek", "piesek", "samolot", "krzesło", "oczy", "dach",
                "płyta", "gród", "rolka", "klucz", "korzeń", "taliz",
                "gracz", "łyżwa", "dymek", "gaz", "dąb", "krew",
                "zamek", "ćwierć", "język", "patyk", "czuł", "osioł",
                "pałka", "taśma", "kalosz", "lina", "dziób", "trąb",
                "serek", "brama", "łuk", "chust", "czapk", "miark",
                "kula", "klatka", "morda", "pochwa", "krat", "łeb",
                "rękaw", "koń", "gęś", "orkiest", "osioł", "kotek",
                "lody", "myśl", "staj", "smycz", "krówk", "łuk",
                "żaba", "koza", "szpak", "tanie", "woda", "bańka",
                "dąb", "łuk", "łasic", "koza", "tata", "domek",
                "grzejn", "kaftan", "pokój", "król", "sowa", "żyrafa",
                "list", "hodowl", "ławka", "przód", "ptak", "sieczk",
                "wiewió", "dach", "żabka", "bańk", "dąb", "łuk",
                "lornet", "pływak", "papier",
                "zawzyj"
        };
    }

    public String getRandomWord() {
        String[] words = words();
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}
