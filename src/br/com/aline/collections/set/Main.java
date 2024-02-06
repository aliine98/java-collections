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
    }
}
