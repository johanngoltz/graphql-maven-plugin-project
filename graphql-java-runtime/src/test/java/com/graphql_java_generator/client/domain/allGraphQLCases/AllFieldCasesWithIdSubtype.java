package com.graphql_java_generator.client.domain.allGraphQLCases;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class AllFieldCasesWithIdSubtype {

	@JsonProperty("id")
	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	String id;

	@JsonProperty("name")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String name;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AllFieldCasesWithIdSubtype {" + "id: " + id + ", " + "name: " + name + "}";
	}
}
