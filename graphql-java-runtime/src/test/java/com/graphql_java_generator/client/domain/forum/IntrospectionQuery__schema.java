package com.graphql_java_generator.client.domain.forum;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class IntrospectionQuery__schema {

	@JsonProperty("__schema")
	__Schema __schema;

	public void set__schema(__Schema __schema) {
		this.__schema = __schema;
	}

	public __Schema get__schema() {
		return __schema;
	}
	
    @Override
	public String toString() {
        return "IntrospectionQuery__schema {__schema: " + __schema + "}";
    }
}
