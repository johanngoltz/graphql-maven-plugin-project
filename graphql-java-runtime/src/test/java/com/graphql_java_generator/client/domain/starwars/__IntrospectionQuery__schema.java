package com.graphql_java_generator.client.domain.starwars;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class __IntrospectionQuery__schema {

	@JsonProperty("__schema")
	__Schema __schema;

	public void set__schema(__Schema __schema) {
		this.__schema = __schema;
	}

	public __Schema get__schema() {
		return __schema;
	}
	
    public String toString() {
        return "__IntrospectionQuery__schema {__schema: " + __schema + "}";
    }
}
