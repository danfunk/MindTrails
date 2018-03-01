package org.mindtrails.domain.forms;

import lombok.Data;
import org.mindtrails.domain.Participant;

/**
 * For updating a participant through the admin screen
 */
@Data
public class ParticipantUpdateAdmin extends ParticipantUpdate {

    private boolean active;
    private boolean admin;
    private boolean testAccount;
<<<<<<< HEAD
=======
    private boolean blacklist;
>>>>>>> upstream/master

    public ParticipantUpdateAdmin() {}

    public ParticipantUpdateAdmin(Participant p) {
        this.fromParticipant(p);
    }

    @Override
    public void fromParticipant(Participant p) {
        super.fromParticipant(p);
        this.active = p.isActive();
        this.admin = p.isAdmin();
        this.testAccount = p.isTestAccount();
<<<<<<< HEAD
=======
        this.blacklist=p.isBlacklist();
>>>>>>> upstream/master
    }

    @Override
    public Participant updateParticipant(Participant p) {
        super.updateParticipant(p);
        p.setActive(this.isActive());
        p.setAdmin(this.isAdmin());
        p.setTestAccount(this.isTestAccount());
<<<<<<< HEAD
=======
        p.setBlacklist(this.isBlacklist());
>>>>>>> upstream/master
        return p;
    }

}
