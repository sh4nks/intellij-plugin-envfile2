package com.peterjustin.envfile.core.providers.yaml;

import com.peterjustin.envfile.core.EnvVarsProvider;
import com.peterjustin.envfile.core.EnvVarsProviderFactory;
import com.peterjustin.envfile.core.providers.EnvFileExecutor;
import com.peterjustin.envfile.core.providers.EnvFileReader;
import com.peterjustin.envfile.core.providers.SingleFileEnvVarsProvider;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;
import java.util.function.Consumer;

public class YamlEnvFileParserFactory implements EnvVarsProviderFactory {
    private static final Yaml YAML = new Yaml();

    @Override
    public EnvVarsProvider createProvider(Map<String, String> baseEnvVars, Consumer<String> logger) {
        return SingleFileEnvVarsProvider.builder()
                .reader(EnvFileReader.DEFAULT)
                .executor(EnvFileExecutor.DEFAULT)
                .parser(
                        new YamlEnvFileParser(YAML)
                )
                .logger(logger)
                .build();
    }

    @NotNull
    public String getTitle() {
        return "JSON/YAML";
    }

    @Override
    public boolean isEditable() {
        return true;
    }

}
