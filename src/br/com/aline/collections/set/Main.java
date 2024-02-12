package br.com.aline.collections.set;

public class Main {
    public static void main(String[] args) {
        GuestSet gs = new GuestSet();
        gs.addGuest("Aline",66385);
        gs.addGuest("Lucas",7869160);
        gs.addGuest("Raquel",162228);
        gs.addGuest("Gabriel",3815);
        System.out.println("Total guests: " + gs.countGuests());
        System.out.println(gs.getGuestSet());
        gs.removeByInviteCode(162228);
        System.out.println("Total guests: " + gs.countGuests());
        System.out.println(gs.getGuestSet());

        System.out.println("\n ----------------------------------- \n");

        UniqueWordCollection wc = new UniqueWordCollection();
        wc.addWord("Carnaval");
        wc.addWord("2024");
        wc.addWord("Aline");
        System.out.println("Tem a palavra 'carnaval'? " + wc.contains("carnaval"));
        System.out.println(wc.getUniqueWordsSet());
        wc.removeWord("aline");
        System.out.println(wc.getUniqueWordsSet());
    }
}
