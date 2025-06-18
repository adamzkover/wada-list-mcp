package no.ntnu.folk.adamzk.wada.mcp;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WadaListToolsConfiguration {

    @Bean
    public ToolCallbackProvider myTools() {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(new MedicationsEvaluateTool())
                .build();
    }

}
