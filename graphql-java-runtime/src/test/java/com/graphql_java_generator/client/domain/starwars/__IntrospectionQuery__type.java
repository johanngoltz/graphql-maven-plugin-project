package com.graphql_java_generator.client.domain.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class __IntrospectionQuery__type {

	@JsonProperty("__type")
	__Type __type;

	public void set__type(__Type __type) {
		this.__type = __type;
	}

	public __Type get__type() {
		return __type;
	}
	
    @Override
	public String toString() {
        return "__IntrospectionQuery__type {__type: " + __type + "}";
    }
}
