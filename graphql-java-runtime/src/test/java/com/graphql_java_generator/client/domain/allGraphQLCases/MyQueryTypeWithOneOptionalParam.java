package com.graphql_java_generator.client.domain.allGraphQLCases;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class MyQueryTypeWithOneOptionalParam {

	@JsonProperty("withOneOptionalParam")
	Character withOneOptionalParam;

	public void setWithOneOptionalParam(Character withOneOptionalParam) {
		this.withOneOptionalParam = withOneOptionalParam;
	}

	public Character getWithOneOptionalParam() {
		return withOneOptionalParam;
	}

	@Override
	public String toString() {
		return "MyQueryTypeWithOneOptionalParam {withOneOptionalParam: " + withOneOptionalParam + "}";
	}
}
