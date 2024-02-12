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

        System.out.println("\n ----------------------------------- \n");

        ContactBook cb = new ContactBook();

        cb.addContact("Aline",999999999);
        cb.addContact("Aline 2",555555555);
        cb.addContact("Igor",888888888);
        cb.addContact("Thiago",777777777);
        cb.addContact("Thiago 2",666666666);
        System.out.println(cb.getContactSet());
        System.out.println("Há contato com nome 'aline'? " + cb.searchByName("aline"));
        System.out.println("Há contato com nome 'vitória'? " + cb.searchByName("vitória"));
        cb.removeContact("thiago 2");
        System.out.println("Depois de remover:");
        System.out.println(cb.getContactSet());
        cb.updateContactNumber("aline",444444444);
        System.out.println("Depois de mudar número");
        System.out.println(cb.getContactSet());
    }
}
