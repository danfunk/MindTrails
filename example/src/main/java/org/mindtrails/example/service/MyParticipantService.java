package org.mindtrails.example.service;

import org.mindtrails.domain.Participant;
import org.mindtrails.domain.Study;
import org.mindtrails.example.MyStudy;
import org.mindtrails.persistence.ParticipantRepository;
import org.mindtrails.service.ParticipantService;
import org.mindtrails.service.ParticipantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Largely a wrapper around the Participant Repository.  Allows us to
 * save, create, and find customized participant objects.
 */
@Service
public class MyParticipantService extends ParticipantServiceImpl implements ParticipantService {


    @Autowired
    ParticipantRepository participantRepository;

    @Override
    public Participant create() {
        Participant p = new Participant();
        MyStudy study = new MyStudy();
        p.setStudy(study);

        return p;
    }

    @Override
    public List<Study> getStudies() {
        List<Study> studies = new ArrayList<>();
        studies.add(new MyStudy());
        return studies;
    }


    @Override
    public boolean isEligible(HttpSession session) {
        return true;
    }

    @Override
    public void saveNew(Participant p, HttpSession session) {
        save(p);

    }

}