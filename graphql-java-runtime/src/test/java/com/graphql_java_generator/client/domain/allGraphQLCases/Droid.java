package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class Droid implements Character {

	@JsonProperty("id")
	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	String id;

	@JsonProperty("name")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String name;

	@JsonProperty("friends")
	@GraphQLNonScalar(graphQLTypeName = "Character", javaClass = Character.class)
	List<Character> friends;

	@JsonProperty("appearsIn")
	@JsonDeserialize(contentAs = Episode.class)
	@GraphQLScalar(graphQLTypeName = "Episode", javaClass = Episode.class)
	List<Episode> appearsIn;

	@JsonProperty("primaryFunction")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String primaryFunction;

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setFriends(List<Character> friends) {
		this.friends = friends;
	}

	@Override
	public List<Character> getFriends() {
		return friends;
	}

	@Override
	public void setAppearsIn(List<Episode> appearsIn) {
		this.appearsIn = appearsIn;
	}

	@Override
	public List<Episode> getAppearsIn() {
		return appearsIn;
	}

	public void setPrimaryFunction(String primaryFunction) {
		this.primaryFunction = primaryFunction;
	}

	public String getPrimaryFunction() {
		return primaryFunction;
	}

	@Override
	public String toString() {
		return "Droid {" + "id: " + id + ", " + "name: " + name + ", " + "friends: " + friends + ", " + "appearsIn: "
				+ appearsIn + ", " + "primaryFunction: " + primaryFunction + "}";
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
