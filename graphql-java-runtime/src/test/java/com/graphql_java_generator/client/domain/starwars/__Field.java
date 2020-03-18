package com.graphql_java_generator.client.domain.starwars;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;


/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class __Field  {

	@JsonProperty("name")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String name;


	@JsonProperty("description")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String description;


	@JsonProperty("args")
	@JsonDeserialize(contentAs = __InputValue.class)
	@GraphQLNonScalar(graphQLTypeName = "__InputValue", javaClass = __InputValue.class)
	List<__InputValue> args;


	@JsonProperty("type")
	@GraphQLNonScalar(graphQLTypeName = "__Type", javaClass = __Type.class)
	__Type type;


	@JsonProperty("isDeprecated")
	@GraphQLScalar(graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean isDeprecated;


	@JsonProperty("deprecationReason")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String deprecationReason;


	@JsonProperty("__typename")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String __typename;



	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setArgs(List<__InputValue> args) {
		this.args = args;
	}

	public List<__InputValue> getArgs() {
		return args;
	}

	public void setType(__Type type) {
		this.type = type;
	}

	public __Type getType() {
		return type;
	}

	public void setIsDeprecated(Boolean isDeprecated) {
		this.isDeprecated = isDeprecated;
	}

	public Boolean getIsDeprecated() {
		return isDeprecated;
	}

	public void setDeprecationReason(String deprecationReason) {
		this.deprecationReason = deprecationReason;
	}

	public String getDeprecationReason() {
		return deprecationReason;
	}

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	public String get__typename() {
		return __typename;
	}

    @Override
	public String toString() {
        return "__Field {"
				+ "name: " + name
				+ ", "
				+ "description: " + description
				+ ", "
				+ "args: " + args
				+ ", "
				+ "type: " + type
				+ ", "
				+ "isDeprecated: " + isDeprecated
				+ ", "
				+ "deprecationReason: " + deprecationReason
				+ ", "
				+ "__typename: " + __typename
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field {
		Name("name"),
		Description("description"),
		Args("args"),
		Type("type"),
		IsDeprecated("isDeprecated"),
		DeprecationReason("deprecationReason"),
		__typename("__typename");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

	}
}
