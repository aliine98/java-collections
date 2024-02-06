package br.com.aline.collections.set;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestSet = new HashSet<>();

    void addGuest(String name, int inviteCode) {
        this.guestSet.add(new Guest(name, inviteCode));
    }

    Set<Guest> getGuestSet() {
        return guestSet;
    }

    void removeByInviteCode(int inviteCode) {
        Set<Guest> guestsToRemove = new HashSet<>();
        for (Guest g : guestSet) {
            if(g.getInviteCode() == inviteCode) {
                guestsToRemove.add(g);
            }
        }
        guestSet.removeAll(guestsToRemove);
    }

    int countGuests() {
        return guestSet.size();
    }
}
