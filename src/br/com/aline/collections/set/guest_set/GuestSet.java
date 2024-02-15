package br.com.aline.collections.set.guest_set;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestSet = new HashSet<>();

    public void addGuest(String name, int inviteCode) {
        this.guestSet.add(new Guest(name, inviteCode));
    }

    public Set<Guest> getGuestSet() {
        return guestSet;
    }

    public void removeByInviteCode(int inviteCode) {
        Set<Guest> guestsToRemove = new HashSet<>();
        for (Guest g : guestSet) {
            if(g.getInviteCode() == inviteCode) {
                guestsToRemove.add(g);
            }
        }
        guestSet.removeAll(guestsToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }
}
