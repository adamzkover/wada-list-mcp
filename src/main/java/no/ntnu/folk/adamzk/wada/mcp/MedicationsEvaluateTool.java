package no.ntnu.folk.adamzk.wada.mcp;

import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

public class MedicationsEvaluateTool {

    @Tool(description = "Evaluate the medications against the WADA List.")
    String evaluateMedications(@ToolParam(description = "List of medications to evaluate") List<String> medications) {
        // TODO:
        // Look up medication ID by name
        // Compile a FHIR Parameters resource according to the wada-list-fhir IG
        // Query the API
        // Compile a string response based on the structured FHIR API response
        return "Evaluation results: Approved";
    }

}
