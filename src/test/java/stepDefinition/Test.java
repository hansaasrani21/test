package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	public static Integer n1, n2, sum = 0;

	@Given("i have two numbers {int} {int}")
	public void i_have_two_numbers(Integer int1, Integer int2) {
		n1 = int1;
		n2 = int2;
	}

	@When("i perform mathematical operation {string} on them")
	public void i_perform_mathematical_operation_on_them(String operation) {
		System.out.println("Performing Mathematical Operation : " + operation);
		sum = n1 + n2;
	}

	@Then("i print the result")
	public void i_print_the_result() {
		System.out.println("Result is: " + sum);
	}
}
