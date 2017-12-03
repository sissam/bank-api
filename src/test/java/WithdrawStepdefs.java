import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class WithdrawStepdefs implements En {
    public WithdrawStepdefs() {
        When("^withdraw (\\d+)$", (Integer arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
