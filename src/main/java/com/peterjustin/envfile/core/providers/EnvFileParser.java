package com.peterjustin.envfile.core.providers;

import com.peterjustin.envfile.core.exceptions.InvalidEnvFileException;

import java.util.Map;

@FunctionalInterface
public interface EnvFileParser {

    Map<String, String> parse(String content) throws InvalidEnvFileException;
}
