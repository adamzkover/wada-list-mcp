package no.ntnu.folk.adamzk.wada.mcp;

import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

public class MedicationsEvaluateTool {

    @Tool(description = "Evaluate the medications against the WADA List.")
    String evaluateMedications(@ToolParam(description = "List of medications to evaluate") List<String> medications) {
        return "Evaluation results: Approved";
    }

}
