package org.mindtrails.example;

import lombok.Data;
import org.mindtrails.domain.BaseStudy;
import org.mindtrails.domain.Session;
import org.mindtrails.domain.Task;
import org.mindtrails.domain.tracking.TaskLog;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This is where you define the sessions and tasks that make up the study you are running.
 * The example provided here does a quick questionnaire, followed by a JSPsych study across
 * two sessions, with an enforced pause of 2 days.
 *
 * The actual tasks and training are defined elsewhere.  What you are defining here is how
 * the study is run, the order of the tasks, and how the user should progress.
 *
 * There is no set number of sessions or predefined tasks.
 */
@Entity
@Data
@DiscriminatorValue("MyStudy")
public class MyStudy extends BaseStudy {


    @Override
    public String getName() {return "My MindTrails Study";}

    public MyStudy() {
        this.currentSession =  "firstSession";
    }

    public MyStudy(String currentSession, int taskIndex, Date lastSessionDate, List<TaskLog> taskLogs, boolean receiveGiftCards) {
        super(currentSession, taskIndex, lastSessionDate, taskLogs, receiveGiftCards);
    }

    /**
     * Returns the list of sessions and tasks that define the study.
     * @return
     */
    @Override
    public List<Session> getStatelessSessions() {
        List<Session> sessions = new ArrayList<>();
        Session session1, session2;

        session1 = new Session("firstSession", "The First Session", 0, 0);
        session1.addTask(new Task("Demographics","Personal Background", Task.TYPE.questions, 2));
        session1.addTask(new Task("trainingOne","Training Session One", Task.TYPE.jspsych, 2));
        session1.setIndex(1);
        sessions.add(session1);

        session2 = new Session("secondSession", "The Second Session", 0, 1);
        session2.addTask(new Task("simpleQuestions","My Mood", Task.TYPE.questions, 1));
        session2.addTask(new Task("trainingTwo","Training Session Two", Task.TYPE.jspsych, 2));
        session2.setIndex(2);
        sessions.add(session2);

        return sessions;
    }
}
