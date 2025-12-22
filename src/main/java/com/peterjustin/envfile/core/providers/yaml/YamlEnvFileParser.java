package com.peterjustin.envfile.core.providers.yaml;

import lombok.AllArgsConstructor;
import com.peterjustin.envfile.core.providers.EnvFileParser;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

@AllArgsConstructor
public class YamlEnvFileParser implements EnvFileParser {
    private final Yaml yaml;

    @Override
    public Map<String, String> parse(String content) {
        return yaml.load(content);
    }
}
