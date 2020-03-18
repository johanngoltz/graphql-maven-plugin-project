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

public class __Schema  {

	@JsonProperty("description")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String description;


	@JsonProperty("types")
	@JsonDeserialize(contentAs = __Type.class)
	@GraphQLNonScalar(graphQLTypeName = "__Type", javaClass = __Type.class)
	List<__Type> types;


	@JsonProperty("queryType")
	@GraphQLNonScalar(graphQLTypeName = "__Type", javaClass = __Type.class)
	__Type queryType;


	@JsonProperty("mutationType")
	@GraphQLNonScalar(graphQLTypeName = "__Type", javaClass = __Type.class)
	__Type mutationType;


	@JsonProperty("subscriptionType")
	@GraphQLNonScalar(graphQLTypeName = "__Type", javaClass = __Type.class)
	__Type subscriptionType;


	@JsonProperty("directives")
	@JsonDeserialize(contentAs = __Directive.class)
	@GraphQLNonScalar(graphQLTypeName = "__Directive", javaClass = __Directive.class)
	List<__Directive> directives;


	@JsonProperty("__typename")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String __typename;



	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setTypes(List<__Type> types) {
		this.types = types;
	}

	public List<__Type> getTypes() {
		return types;
	}

	public void setQueryType(__Type queryType) {
		this.queryType = queryType;
	}

	public __Type getQueryType() {
		return queryType;
	}

	public void setMutationType(__Type mutationType) {
		this.mutationType = mutationType;
	}

	public __Type getMutationType() {
		return mutationType;
	}

	public void setSubscriptionType(__Type subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public __Type getSubscriptionType() {
		return subscriptionType;
	}

	public void setDirectives(List<__Directive> directives) {
		this.directives = directives;
	}

	public List<__Directive> getDirectives() {
		return directives;
	}

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	public String get__typename() {
		return __typename;
	}

    @Override
	public String toString() {
        return "__Schema {"
				+ "description: " + description
				+ ", "
				+ "types: " + types
				+ ", "
				+ "queryType: " + queryType
				+ ", "
				+ "mutationType: " + mutationType
				+ ", "
				+ "subscriptionType: " + subscriptionType
				+ ", "
				+ "directives: " + directives
				+ ", "
				+ "__typename: " + __typename
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field {
		Description("description"),
		Types("types"),
		QueryType("queryType"),
		MutationType("mutationType"),
		SubscriptionType("subscriptionType"),
		Directives("directives"),
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
