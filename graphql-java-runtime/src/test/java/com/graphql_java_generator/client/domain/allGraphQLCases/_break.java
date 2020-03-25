package com.graphql_java_generator.client.domain.allGraphQLCases;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("break")
public class _break {

	@GraphQLInputParameters(names = { "test", "if" }, types = { "extends", "else" })
	@JsonProperty("case")
	@GraphQLScalar(graphQLTypeName = "extends", javaClass = _extends.class)
	_extends _case;

	public void setCase(_extends _case) {
		this._case = _case;
	}

	public _extends getCase() {
		return _case;
	}

	@Override
	public String toString() {
		return "_break {" + "_case: " + _case + "}";
	}

	@JsonProperty("__typename")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String __typename;

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	public String get__typename() {
		return __typename;
	}
}
