package com.slashqa;
import com.slashqa.utils.SessionUtils;

import io.cucumber.java.en.Given;

public class StepDefinitionsPartOne {
    SessionUtils session;
    public StepDefinitionsPartOne(SessionUtils sessionUtils) {
        super();
        session = sessionUtils;
    }

    @Given("I have {string} stored in my session")
    public void iHaveStringStoredInMySession(String stepValue){
        session.put(session.TEST_KEY, stepValue);
    }
}


